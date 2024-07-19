package Code01_Sort;

//选择排序，时间复杂度O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        for(int i = 0;i<a.length-1;i++){
            //需要交换最小数的位置。
            int minindex = i;
            for(int j = i+1;j<a.length;j++){
                //在i+1之后进行最小数的寻找
                minindex = a[i]>a[j]?j:minindex;//交换下标
            }
            //交换数组的最小值到给定的位置
            int temp = a[i];
            a[i] = a[minindex];
            a[minindex] = temp;
        }
        //System.out.println(a.length);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
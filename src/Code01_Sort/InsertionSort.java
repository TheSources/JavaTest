package Code01_Sort;

public class InsertionSort {
    //插入排序 ,O(n^2)
    public static void main(String[] args) {
        int[] a = {5,4,2,1,3,2,4};
        //0~0天然有序
        //只需要排0~a.length就可以了
        for(int i = 1;i<a.length;i++){
            //新加入的数组为Y,将Y依次向前比较,限制条件为j>=0且a[j]>a[j+1]。j每循环一次就减1
            for(int j = i-1;j>=0&&a[j]>a[j+1];j--){
                swap(a, j,j+1);
            }
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}


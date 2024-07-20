package Code01_Sort;
public class BubbleSort {
    public static void main(String[] args) {
        //冒泡排序，时间复杂度O(n^2)
        int[] a = {5,4,3,2,1};
        //大循环n-1次，e限定交换的下标最大到哪里
        for(int e = a.length-1;e>0;e--){
            //从0~e之间选出最大值，放在a[e]的位置上
            for(int i = 0;i<e;i++){
                if(a[i]>a[i+1]){
                    //交换
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
package Code01_Sort;

import java.util.Arrays;

public class QuickSort {


    public static void swap(int[] a,int i,int j){
        System.out.println(Arrays.toString(a));
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
//        a[i] = a[i] ^ a[j];
//        a[j] = a[i] ^ a[j];
//        a[i] = a[i] ^ a[j];
    }
    //快速排序3.0版本
    public static void quickSort(int[] a){
        if(a == null || a.length < 2){
            return;
        }
        quickSort(a,0,a.length-1);
    }
    public static void quickSort(int[] a,int L,int R){
        if(L < R){
            swap(a,L + (int)(Math.random() * (R - L + 1)),R);
            int[] p = partition(a,L,R);
            quickSort(a,L,p[0]-1);
            quickSort(a,p[1]+1,R);
        }
    }
    //分层
    public static int[] partition (int[] a,int L,int R){
        int less = L - 1;//小于区域边界
        int more = R;//大于边界
        while(L < more){
            if(a[L] < a[R]){
                swap(a, ++less, L++);
            }else if (a[L] > a[R]) {
                swap(a, --more, L);
            }else{
                L++;
            }
        }
        swap(a,more,R);
        //System.out.println(Arrays.toString(a));
        return new int[] { less + 1, more };
    }
    //Math.random()返回一个0.0~1.0之间的数字
    public static void main(String[] args) {
        int[] a ={5,3,2,5,1,7,9,4,6,8};
        quickSort(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
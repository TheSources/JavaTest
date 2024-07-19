package Code01_Sort;

import java.util.Arrays;

public class HeapSort {
    //堆排序，时间复杂度O(N * logn)
    public static void main(String[] args) {
        int[] a = {9,6,4,5,7,2,3,8,1};
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void heapSort(int[] a){
        if(a == null || a.length < 2){
            return;
        }
//        for(int i = 0 ; i < a.length ; i++){
//            heapInsert(a , i);
//        }//慢一点，但更好理解
        for(int i = a.length - 1;i >= 0; i--){
            heapify(a,i,a.length);
        }
        int heapSize = a.length;
        //System.out.println(Arrays.toString(a));
        swap(a,0,--heapSize);
        while(heapSize > 0){
            heapify(a,0,heapSize);
            swap(a,0,--heapSize);
        }
    }
    //插入一个数，向上查找
    public static void heapInsert(int[] a,int index){
        while(a[index] > a[(index - 1)/2]){
            swap(a,index,(index - 1) / 2);
            index  = (index - 1)/2;
        }
    }
    //从index位置往下做heapify
    public static void heapify(int[] a,int index,int heapSize){
        int left = 2 * index + 1;//左孩子的下标
        while(left < heapSize){
            int largest = left + 1 < heapSize && a[left + 1] > a[left]?
                    left + 1: left;
            largest = a[index] > a[largest]?index : largest;
            if(largest == index){
                break;
            }
            swap(a,index,largest);
            index = largest;
            left = index * 2 + 1;
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

package Code01_Sort;

import java.util.Arrays;

public class HeapSortTest {
    public static void main(String[] args) {
        int[] a = {9,6,4,5,7,2,3,8,1};
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void heapSort(int[] a){
        if(a == null || a.length < 2){
            return;
        }
        for(int i = 0;i< a.length;i++){
            heapInsert(a,i);
        }
        int heapSize = a.length;
        swap(a,0,--heapSize);
        while(heapSize > 0){
            heapify(a,0,heapSize);
            swap(a,0,--heapSize);
        }
    }
    public static void heapInsert(int[] a,int index){
        while(a[index] > a[(index - 1) / 2]){
            swap(a,index,(index - 1)/2);
            index = (index - 1)/2;
        }
    }
    public static void heapify(int[] a,int index,int heapSize){
        int left = index * 2 + 1;
        while(left < heapSize){
            int largest = left + 1 < heapSize && a[left + 1] > a[left]?
                    left + 1 : left;
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

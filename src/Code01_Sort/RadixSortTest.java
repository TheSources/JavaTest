package Code01_Sort;

import java.util.Arrays;

public class RadixSortTest {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        radixSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void radixSort(int[] a){
        if(a == null || a.length < 2){
            return ;
        }
        radixSort(a,0,a.length-1,maxbits(a));
    }
    public static void radixSort(int[] a,int L ,int R,int digit){
        final int radix = 10;
        int i = 0,j = 0;
        int[] bucket = new int[R - L + 1];
        for(int d = 1;d <= digit; d++) {
            int[] count = new int[radix];
            for(i = L ;i <= R ;i++){
                j = getDigit(a[i],digit);
                count[j]++;
            }
            for(i = 1;i < radix;i++){
                count[i] = count[i] + count[i - 1];
            }
            for(i = R;i >=L;i++) {
                j = getDigit(a[i],d);
                bucket[count[j] - 1] = a[i];
                count[j]--;
            }
            for(i = L,j = 0;i <= R; i++,j++){
                a[i] = bucket[j];
            }
        }
    }
    public static int getDigit(int x,int digit){
        return ((x / ((int)Math.pow(10,digit - 1))) % 10);
    }
    public static int maxbits(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < a.length;i++){
            max = Math.max(max,a[i]);
        }
        int res = 0;
        while(max != 0){
            max /= 10;
            res++;
        }
        return res;
    }
}

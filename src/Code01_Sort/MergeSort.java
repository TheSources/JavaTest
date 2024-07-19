package Code01_Sort;

public class MergeSort {
    //归并排序
    public static void mergetSort(int[] a){
        if(a==null||a.length<2){
            return;
        }
        process(a,0,a.length-1);
    }
    public static void process(int[] a,int L,int R){
        if(L==R){
            return;
        }
        int mid = L + ((R-L)>>1);
        process(a,L,mid);
        process(a,mid+1,R);
        merge(a,L,mid,R);
    }
    public static void merge(int[] a,int L,int M,int R){
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while(p1 <= M && p2 <= R){
            help[i++] = a[p1] <= a[p2] ? a[p1++] : a[p2++];
        }
        while(p1 <= M){
            help[i++] = a[p1++];
        }
        while(p2 <= R){
            help[i++] = a[p2++];
        }
        for(int x = 0; x<help.length; x++){
            a[L + x] = help[x];
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,5,623,46123,4,6,6573,134,26,35,356246,322145};
        mergetSort(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}

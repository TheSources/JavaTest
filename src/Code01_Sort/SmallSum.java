package Code01_Sort;

public class SmallSum {
    //小和问题
    public static int smallSum(int[] a){
        if(a == null || a.length < 2){
            return 0;
        }
        return process(a,0,a.length-1);
    }
    public static int process(int[] a,int L,int R){
        if(L==R){
            return 0;
        }
        int mid = L + ((R - L)>>1);
        return process(a,L,mid) + process(a,mid+1,R) + merge(a,L,mid,R);
    }
    public static int merge(int[] a,int L,int M,int R){
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        int res = 0;
        while(p1 <= M && p2 <= R){
            res += a[p1] < a[p2] ? a[p1] * (R -p2 +1):0;
            help[i++] = a[p1] >= a[p2] ? a[p2++]:a[p1++];
        }
        while(p1 <= M){
            help[i++] = a[p1++];
        }
        while(p2 <= R){
            help[i++] = a[p2++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1,3,4,2,5};
        smallSum(a);
        System.out.println(smallSum(a));
    }
}

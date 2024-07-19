package Code01_Sort;

public class GetMax {
    public static int getmax(int[] a){
        return process(a,0,a.length-1);
    }
    public static int process(int[] a,int L,int R){
        if(L==R){
            return a[L];
        }
        int mid = L + ((R - L)>>1);
        int LeftMax = process(a,L,mid);
        int RightMax = process(a,mid+1,R);
        return Math.max(LeftMax,RightMax);
    }

    public static void main(String[] args) {
        int[] a = {73,547,54,62,23467245,7,2457,6245,7354,27,4567,835,67,347,999999999};
        System.out.println(getmax(a));
    }
}

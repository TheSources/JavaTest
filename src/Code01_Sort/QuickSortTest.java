package Code01_Sort;

public class QuickSortTest {
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void quickSort(int[] a){
        if(a == null || a.length < 2){
            return;
        }
        quickSort(a,0,a.length-1);
    }
    public static void quickSort(int[] a,int L,int R){
        if(L < R){
            int[] p = partition(a,L,R);
            partition(a,L,p[0]-1);
            partition(a,p[1]+1,R);
        }
    }
    public static int[] partition(int[] a,int L,int R){
        swap(a,L + (int)(Math.random()*(R + 1 - L)),R);
        int less = L - 1;
        int more = R;
        while(L < more){
            if(a[L] < a[R]){
                swap(a,++less,L++);
            } else if (a[L] > a[R]) {
                swap(a,L,--more);
            }else{
                L++;
            }
        }
        swap(a,more,R);
        return new int[] {less + 1,more};
    }

    public static void main(String[] args) {
        int[] a ={5,3,2,5,1,7,9,4,6,8};
        quickSort(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}

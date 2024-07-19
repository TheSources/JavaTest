package Code_Luogu.Code_14c;

import java.util.Arrays;
import java.util.Scanner;

public class Code_04 {
    public static void main(String[] args) {
        //输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ai = new int[n];
        int[] bi = new int[n];
        for(int i = 0;i < n;i++) {
            ai[i] = scanner.nextInt();
            bi[i] = scanner.nextInt();
        }

        int count = 0;
        int[] sum = new int[n];
        for(int i = 0;i < n;i++) {
            int temp = 0;
            for(int j = 0;j < n;j++) {

                if(ai[j] == i) {
                    sum[temp] = bi[j];
                    temp++;
                }
            }
            int kkk = 0;
            Arrays.sort(sum);
            for(int m = 0;m < n - 1;m++) {
                count = count + sum[m];
            }
            for(int m = 0;m < n ;m++) {
                sum[m] = 0;
            }
        }
        System.out.print(count);
    }
}

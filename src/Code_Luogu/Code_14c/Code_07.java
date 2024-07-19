package Code_Luogu.Code_14c;

import java.util.Arrays;
import java.util.Scanner;

public class Code_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[][] Arr = new int[n][m];


        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m ; j++) {
                Arr[i][j] = scan.nextInt();
            }
        }

        int row = 0;
        int list = 0;
        int sum = 0;
        int[] arr = new int[a*b];
        for(int i = row;i < a + row;i++) {
            int temp = 0;
            for(int j = list ; j < b + list ; j++) {
               // int temp = 0;
                arr[temp] = Arr[i][j];
                temp++;

            }
            Arrays.sort(arr);
            sum = sum + arr[0] * arr[a * b - 1];
            if(row + b <= m - 1) {
                row++;
            } else if (row + b > m - 1 || list + a <= n - 1) {
                row = 0;
                list++;
            }else{
                break;
            }
        }
        System.out.println(sum);
    }
}

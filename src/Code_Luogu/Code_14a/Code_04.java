package Code_Luogu.Code_14a;

import java.util.Scanner;

public class Code_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] cb = new int[n][n];
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                cb[i][j] = 0;
            }
        }
        int[] x1 = new int[m];
        int[] y1 = new int[m];
        int[] x2 = new int[m];
        int[] y2 = new int[m];


        for(int i = 0;i < m;i++) {
            x1[i] = scan.nextInt();
            y1[i] = scan.nextInt();
            x2[i] = scan.nextInt();
            y2[i] = scan.nextInt();
        }

        for(int i = 0;i < m;i++) {
            for(int j = x1[i] - 1;j <= x2[i] - 1;j++) {
                for(int k = y1[i] - 1;k <= y2[i] - 1;k++) {
                    cb[j][k]++;
                }
            }
        }

        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                cb[i][j] = cb[i][j]%2;
            }
        }
        for(int i = 0;i<3;i++){
            System.out.print(cb[0][i]);
        }
        System.out.println();

        for(int i = 0;i<3;i++){
            System.out.print(cb[1][i]);
        }
        System.out.println();
        for(int i = 0;i<3;i++){
            System.out.print(cb[2][i]);
        }
    }
}

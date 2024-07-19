package Code_Luogu.Code_14c;

import java.util.Arrays;
import java.util.Scanner;

public class Code_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        String str = scan.next();
        int[] Arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            Arr[i] = (int)str.charAt(i);
            //System.out.println(Arr[i]);
        }
        Arrays.sort(Arr);
        char[] c = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            c[i] = (char)Arr[i];
        }
    }
}

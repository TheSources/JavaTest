package Code_Luogu.Code_14c;

import java.util.Arrays;
import java.util.Scanner;

public class Code_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] c = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
        int[] temp = new int[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(c[i] == '?') {
                temp[count] = i;
                count++;
            }
        }



        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[0] == '\u0000') {
                break;
            }
            if(c.length>=2) {
                i = 0;
                if(c[i] == c[i + 1] ) {
                    sum++;
                    c = Arrays.copyOfRange(c,i + 2,str.length());
                }else if (c[i] == '?') {
                    c[i] = c[i + 1];
                    sum++;
                    c = Arrays.copyOfRange(c,i + 2,str.length());
                }else if (c[i + 1] == '?') {
                    c[i] = c[i + 1];
                    sum++;
                    c = Arrays.copyOfRange(c,i + 2,str.length());
                }else if (c[i] != c[i + 1]) {
                    c = Arrays.copyOfRange(c,i + 2,str.length());
                }
            }
        }
        System.out.println(sum);
    }
}

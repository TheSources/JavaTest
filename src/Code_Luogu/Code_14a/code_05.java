package Code_Luogu.Code_14a;

import java.util.Scanner;

public class code_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int temp = (int) Math.pow(a,b);
        int count = 0;
        for(int x = 1;x < temp;x++) {
            for(int i = 1;i <= x;i++) {
                if(temp % i != 0 || x % i != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(count % 99824453);

    }
}

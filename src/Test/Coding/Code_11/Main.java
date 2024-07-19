package Test.Coding.Code_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(test(str));
    }
    public static String test(String str) {
        int num = 0;
        int letter = 0;
        int capital = 0;
        for(char c : str.toCharArray()) {
            if(c <= '9' && c >= '0'){
                num++;
            } else if (c <= 'z' && c >= 'a') {
                letter++;
            } else if (c <= 'Z' && c >= 'A') {
                capital++;
            }
        }
        return (num + " " + letter + " " + capital);
    }
}

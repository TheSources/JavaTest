package Test.Coding.Code_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N == 1 || N == 2){
            System.out.println("1");
        }else {
            int month = process(N);
            System.out.println(month);
        }

    }
    public static int process(int N) {
        long[] fib = new long[N + 1];
        fib[1] = 1;
        fib[2] = 1;
        int month = 2;
        while (fib[month] < N) {
            month++;
            fib[month] = fib[month - 1] + fib[month - 2];
        }
        return month;
    }

}
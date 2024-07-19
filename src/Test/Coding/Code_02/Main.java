package Test.Coding.Code_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int score = hh(str);
        System.out.println(score);
    }

    public static int hh(String s) {
        int score = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++; // 遇到1，增加计数
                score += count; // 将当前计数加到总分中
            } else {
                count = 0; // 遇到0，重置计数为0
            }
        }
        return score;
    }
}



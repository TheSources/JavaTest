package Test.Coding.Code_03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    涛涛去小焦家里玩，小焦正在家里学习英语，涛涛很好奇，涛涛便看着小焦学习，涛涛看到一个老虎的图片，旁边写着“tiger”涛涛
//    很好奇，便问小焦：“这个是什么呀？”小焦说：“这是老虎，这个英语是老虎的意思，我这里有一些英文字母，
//    你来找找，看看最多能组成多少个"tiger"。请问涛涛最多能组成多少个“tiger”？
   public static void main(String[] args) {
//第一行一个正整数n，表示字符串长度，n < 10000000。
//第二行一串只含有小写字母的字符串。
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int[] hh = new int[5];
       String str = scan.next();
       char[] STR = new char[str.length()];
       for(int I = 0;I <= str.length() - 1 ;I++) {
           STR[I] = str.charAt(I);
       }
       for(int j = 0;j <= STR.length - 1; j++) {
           switch (STR[j]) {
               case 't' :
                   hh[0]++;
                   break;
               case 'i' :
                   hh[1]++;
                   break;
               case 'g' :
                   hh[2]++;
                   break;
               case 'e' :
                   hh[3]++;
                   break;
               case 'r':
                   hh[4]++;
                   break;
           }
       }
       Arrays.sort(hh);
       System.out.println(hh[0]);
    }
}

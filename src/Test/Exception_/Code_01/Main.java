package Test.Exception_.Code_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        while(true){
            try {
                int n1 = Integer.parseInt(str1);
                int n2 = Integer.parseInt(str2);
                System.out.println(cal(n1,n2));
                break;
            } catch (NumberFormatException e0) {
                System.out.println("输入的格式不正确");
                break;
            }catch (ArrayIndexOutOfBoundsException e1){
                System.out.println("缺少命令行参数");
                break;
            }catch (ArithmeticException e3) {
                System.out.println("除数不能为0");
                break;
            }
        }
    }
    public static int cal(int n1 ,int n2) {
        return n1/n2;
    }
}

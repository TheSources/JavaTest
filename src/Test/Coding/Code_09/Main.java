package Test.Coding.Code_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String password = scan.next();
        String mail = scan.next();
        message user = new message(name,password,mail);
    }
}
class message {
    private String name;
    private String password;
    private String mail;
    int count = 0;

    public message(String name, String password, String mail) {


        this.name = name;
        if(name.length() <= 4 && name.length() >=2) {
            System.out.println("用户名格式正确。");
        }else {
            System.out.println("用户名格式不正确。");
        }


        this.password = password;
        for(char c : password.toCharArray()) {
            if (!Character.isDigit(c)) {
                count++;
            }
        }
        if(count != 0) {
            System.out.println("密码格式不正确。");
        }else {
            System.out.println("密码格式正确。");
        }



        this.mail = mail;
        if(mail.indexOf("@") != -1 && mail.indexOf(".") != -1
                && mail.indexOf("@") < mail.indexOf(".")) {
            System.out.println("邮件格式正确。");
        }else {
            System.out.println("邮件格式不正确。");
        }
    }
}
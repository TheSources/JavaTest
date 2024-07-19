package Test.Coding.Code_07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //构造方法 Date


        Date d2 = new Date(241810294);
        System.out.println(d2);


        Date d1  = new Date();
        System.out.println("当前日期" + d1);
        //yyyy是年份，MM是月份,dd是日期  h m s 时分秒   E 星期
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf1.format(d1);
        System.out.println(format);


        Calendar c1 = Calendar.getInstance();

        System.out.println(c1.get(Calendar.YEAR) + "年 " + c1.get(Calendar.MONTH) + "月 " + c1.get(Calendar.DATE) + "日 " + c1.get(Calendar.HOUR_OF_DAY) + "时 " + c1.get(Calendar.MINUTE) + "分 " + c1.get(Calendar.SECOND) + "秒");



    }
}

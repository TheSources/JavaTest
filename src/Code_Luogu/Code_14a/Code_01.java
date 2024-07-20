package Code_Luogu.Code_14a;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Code_01 {
    public static void main(String[] args) {

        LocalDate time1 = LocalDate.of(1900,1,1);
        LocalDate time2 = LocalDate.of(9999,12,31);
        int count = 0;

        while(time1.getYear() != time2.getYear() || time1.getMonthValue() == time2.getMonthValue() ||
                time1.getDayOfMonth() != time2.getDayOfMonth()) {

            int year = time1.getYear();
            int month = time1.getMonthValue();
            int day = time1.getDayOfMonth();
            int[] YEAR = new int[4];
            int sum = 0;
            int temp = 0;

            for(int i = 0;i < 4; i++) {
                YEAR[i] = year % 10;
                year = year / 10;
            }


            for(int i = 0;i < 4;i++) {
                sum = YEAR[i] + sum;
            }


            for(int i = 0;i < 2;i++ ) {
                temp = temp + month%10 + day%10;
                month /= 10;
                day /= 10;
            }
            if(sum == temp) {
                count++;
            }
            time1 = time1.plus(1, ChronoUnit.DAYS);
        }
        System.out.println(count);
    }
}

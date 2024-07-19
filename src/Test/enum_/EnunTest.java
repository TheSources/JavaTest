package Test.enum_;

public class EnunTest {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        Week[] weeks  = Week.values();
        for(Week week : weeks){
            System.out.println(week);
        }
    }
}
enum Week {
    MONDAY("1"),TUESDAY("2"),WEDNESDAY("3"),THURSDAY("4"),
    FRIDAY("5"),SATURDAY("6"),SUNDAY("7");
    String decs;
    private Week (String decs){
        this.decs = decs;
    }

    @Override
    public String toString() {
        return decs;
    }
}
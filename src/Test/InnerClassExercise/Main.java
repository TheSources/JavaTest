package Test.InnerClassExercise;

public class Main {
    public static void main(String[] args) {
        Cellphone hh = new Cellphone();
        Cellphone cc = new Cellphone();
        hh.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("hhh");
            }
        });
        hh.aaa(new Fuck() {
            @Override
            void fucking() {
                System.out.println("anana");
            }
        });
    }
}
interface Bell{
    void ring();
}
class Cellphone{

    public void alarmClock(Bell bell){
        bell.ring();
    }
    public void aaa(Fuck fuck){
        fuck.fucking();
    }
}
abstract class Fuck{
    abstract void fucking();
}

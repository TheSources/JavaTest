package Test.extends_;

public class Code_01 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock f1 = new Frock();
        System.out.println(f1.getSeriaNumber());
        Frock f2 = new Frock();
        System.out.println(f2.getSeriaNumber());
        Frock f3 = new Frock();
        System.out.println(f3.getSeriaNumber());
    }
}
class Frock {
    private int seriaNumber;
    public Frock(){
        seriaNumber = getNextNum();
    }

    public int getSeriaNumber() {
        return seriaNumber;
    }

    private static int currentNum = 100000;
    public static int getNextNum(){
        return currentNum += 100;
    }
}

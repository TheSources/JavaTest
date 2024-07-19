package Test.extends_;

public class Code_03 {
    public static void main(String[] args) {
        Cellphone p1 = new Cellphone();
        p1.testWork(new Suanshu() {
            @Override
            public double work(double a, double b) {
                System.out.println("fuck");
                return a + b;
            }
        } , 10 , 8);
    }
}
interface Suanshu {
    double work(double a,double b);
}
class Cellphone {
    void testWork(Suanshu suanfa1 , double a , double b ) {
        suanfa1.work(a,b);
        //System.out.println(suanfa1.work(a,b));
        System.out.println("结束运算");
    }
}
package Test.InnerClassExercise.Code_06;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.Inner();
    }
}
class Car {
    private double temp;

    public Car(double temp) {
        this.temp = temp;
    }

    class Air {
        public void flow() {
            if(temp > 40){
                System.out.println("吹冷风");
            } else if (temp < 0) {
                System.out.println("吹暖气");
            }else {
                System.out.println("关闭");
            }
        }
    }
    public void Inner() {
        Air air = new Air();
        air.flow();
    }
}

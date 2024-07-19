package Test.enum_.Code_07;

public class Main {
    public static void main(String[] args) {
        Color black = Color.BLACK;
        Color fff = Color.BLUE;
        switch (fff){
            case RED -> {
                System.out.println("不对");
                break;
            }
            case BLACK -> {
                System.out.println("对了");
                break;
            }default -> {
                System.out.println("未匹配上");
            }
        }
    }
}
enum Color implements IN{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private double redValue;
    private double greenValue;
    private double blueValue;

    Color(double redValue, double greenValue, double blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }

    public void show() {

    }
}

interface IN {
    void show();
}

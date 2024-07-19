package Test.extends_;

public class Code_04 {
    public static void main(String[] args) {
        new A().work();
    }
}
class A {
    private String name = "刘清源";
    public void work(){
        class B{
            private final String NAME = "张三";
            void show() {
                System.out.println(NAME);
                System.out.println(name);
            }
        }
        B b = new B();
        b.show();
    }
}
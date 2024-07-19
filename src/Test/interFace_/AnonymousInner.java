package Test.interFace_;

public class AnonymousInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}
class Person {
    public void hi(){
        System.out.println("大家好");
    }
}
class Outer{
    public void method(){
        Person person = new Person(){

        };
        System.out.println(person.getClass());
        person.hi();
    }
}


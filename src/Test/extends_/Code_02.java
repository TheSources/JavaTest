package Test.extends_;

public class Code_02 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}
abstract class Animal {
    abstract void shout();
}
class Cat extends Animal {
    void shout(){
        System.out.println("猫会喵喵叫");
    }
}
class Dog extends Animal {
    void shout() {
        System.out.println("狗会汪汪叫");
    }
}

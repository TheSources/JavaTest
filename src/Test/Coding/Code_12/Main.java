package Test.Coding.Code_12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Dog("周志超",19));
        col.add(new Dog("阚凯成",20));
        col.add(new Dog("任浩宇",20));

//        Iterator it = col.iterator();
//        for (Object o : col) {
//            System.out.println(col.toString());
//        }
        Iterator it = col.iterator();
        while(it.hasNext()) {
            Object o = it.next();
            System.out.println("obj = [" + o.toString() + "岁]");
        }
    }
}
@SuppressWarnings("all")
class Dog {
    private String name;
    private int age ;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "快死了 " + age;
    }
}
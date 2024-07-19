package Test.List.Code_02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        m1();
        m2();
    }
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void m2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> cls = Class.forName("Test.List.Code_02.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}

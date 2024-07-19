package Test.List.Code_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {


        Map map = new HashMap();
        map.put(1,new Employ("刘清源",1000,"1"));
        map.put(2,new Employ("朱展锋",180000,"2"));
        map.put(3,new Employ("左艺成",100000,"3"));


        Set set = map.keySet();

        for (Object key:
                set
             ) {
            Employ emp =(Employ) map.get(key);
            if(emp.getSal() >= 18000) {
                System.out.println(key + "-" + map.get(key));
            }

        }
    }
}
class Employ {
    private String name;
    private double sal;
    private String id;

    public Employ() {
    }

    public Employ(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id='" + id + '\'' +
                '}';
    }
}
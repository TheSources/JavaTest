package Test.extends_;

public class Code_05 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.passRiver();
        tang.common();
        tang.takeOff();
    }
}
interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("通常情况下骑马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("遇到河了就开船");
    }
}


class Plane implements Vehicles{
    @Override
    public void work() {
        System.out.println("路过火焰山坐飞机");
    }
}
class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void takeOff() {
        if(!(vehicles instanceof Plane)){
            vehicles = Factory.getPlane();
        }
        vehicles.work();
    }

    public void passRiver() {
//        Boat boat =Factory.getBoat();
//        boat.work();
        if(!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }

    public void common() {

        if(!(vehicles instanceof Horse)) {
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }
}

class Factory {
    private static Horse horse = new Horse();
    private Factory(){};
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}
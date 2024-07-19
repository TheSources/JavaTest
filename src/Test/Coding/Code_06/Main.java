package Test.Coding.Code_06;

public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[0] = new Book("红楼梦" ,100);
        book[1] = new Book("金瓶梅" , 90);
        book[2] = new Book("青年文摘" , 5);
        book[3] = new Book("javc从入门到放弃" , 300);
    }
}
class Book {
    private String name;
    private double price;
    public Book(String name,double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
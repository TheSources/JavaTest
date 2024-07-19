package Test.Coding.Code_10;

public class Main {
    public static void main(String[] args) {
        String name = "Liu Qing Yuan";
        System.out.println(NameFormatter(name));
    }
    public static String NameFormatter(String name) {

        String [] PartOfName = name.split(" ");

        if(name == null) {
            System.out.println("name 不能为空");
            return "";
        }
        return String.format("%s,%s .%c", PartOfName[2],PartOfName[0],
                PartOfName[1].toUpperCase().charAt(0));
    }
}

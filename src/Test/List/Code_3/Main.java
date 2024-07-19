package Test.List.Code_3;

public class Main {
    public static void main(String[] args) {
        Node lqy = new Node("lqy");
        Node zzc = new Node("zzc");
        Node kkc = new Node("kkc");
        Node zzf = new Node("zzf");


        lqy.next = zzc;
        zzc.next = kkc;
        kkc.next = zzf;


        zzf.pre = kkc;
        kkc.pre = zzc;
        zzc.pre = lqy;

        Node first = lqy;
        Node last = zzf;
        while (true) {
            if(first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}
class Node {
    Object item;
    Node next;
    Node pre;
    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}

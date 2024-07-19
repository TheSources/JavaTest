package Test.List.Code_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Books("红楼梦","曹雪清",100));
        list.add(new Books("西游记","吴承恩",10));
        list.add(new Books("三国演义","罗贯中",90));
        list.add(new Books("水浒传","施耐庵",88));
        sort(list);
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println("obj = "+ obj.toString());
        }
    }
    public static void sort(List list) {
        for(int i = 0;i < list.size() - 1;i++) {
            for(int j = 0;j < list.size() - i - 1;j++) {
                Books book1 = (Books) list.get(j);
                Books book2 = (Books) list.get(j + 1);
                if(book1.getStr3() > book2.getStr3()) {
                    list.set(j , book2);
                    list.set(j + 1,book1);
                }
            }
        }

    }
}
class Books {
    String str1;
    String str2;
    int str3;

    public Books(String str1, String str2, int str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public int getStr3() {
        return str3;
    }

    public void setStr3(int str3) {
        this.str3 = str3;
    }

    @Override
    public String toString() {
        return "Books{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                ", str3=" + str3 +
                '}';
    }
}

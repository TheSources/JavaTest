package Test.Coding.Code_08;

public class Main {
    public static void main(String[] args) {
        String str = "abcdef";
        //reverse(str,1,str.length() - 1);
        System.out.println(reverse(str,1,str.length() - 1));

    }
    public static String reverse(String str,int start,int end) {
        char[] c1 = str.toCharArray();
        char temp = ' ';
        for(int i = start,j = end - 1;i < j;i++,j--) {
            temp = c1[i];
            c1[i] = c1[j];
            c1[j] = temp;
        }
        return new String(c1);
        //System.out.println(Arrays.toString(c2));
    }
}

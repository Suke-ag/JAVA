import java.lang.String;
public class Operators {
    public static void main(String[] args) {
        // System.out.println(10<<3); // 10*2^3 = 10*80 = 80
        // System.out.println(10>>2); // 10/2^2 = 10/4 = 2
        // System.out.println(10>>3); // 10/2^3 = 10/8 = 0
        
        // int a = 0;
        // System.out.println(a++);
        // System.out.println(a);

        // String s = " hello world";
        // String str = String.format("New Java Program %s",s);
        String str = "GeeksforGeeks";
        String s = String.format("My Company name is %s", str);

        System.out.println(s);
        
    }
}

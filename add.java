import java.util.Scanner;

public class add {
    public static void main(String[] arg) {
        int age;
        float b;
        char c = 'A';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter the Float : ");
        b = sc.nextFloat();
        System.out.println("Char : " + c);
        System.out.println("Enetered float no. is " + b);
        System.out.println("Your age is " + age);
        sc.close();
    }

}

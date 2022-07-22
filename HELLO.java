import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
        String name = sc.nextLine().toUpperCase();
        System.out.println("Hello Mr."+name);
        sc.close();
    }
}
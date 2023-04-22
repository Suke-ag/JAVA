import java.util.Scanner;

public class celsiusConvertor {
    public static void main(String[] args) {
        // C = (F-32)*5/9
        Scanner sc = new Scanner(System.in);

        double fah = sc.nextDouble();

        double celsius = (fah - 32) * 5 / 9;

        System.out.println(fah + " Fahrenheit is equal to " + celsius + " °C");

        sc.close();
    }
}

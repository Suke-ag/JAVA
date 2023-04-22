import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter weight in Kgs: ");
        double weightInkg = s.nextDouble();
        System.out.println("Enter Height in meters: ");
        double heightInM = s.nextDouble();
        double bmi = weightInkg / (heightInM * heightInM);
        System.out.println("Body Mass Index is " + bmi);
        s.close();
    }
}
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        int firstNum = 0, secondNum = 1, thirdNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want in series: ");
        int n = sc.nextInt();

        System.out.print("\n"+firstNum+ " " +secondNum+ " ");
        for(int i = 3; i<=n ; i++){
            thirdNum = firstNum + secondNum;
            System.out.print(thirdNum+" ");
            firstNum = secondNum;
            secondNum = thirdNum;
        }
        sc.close();
    }
}

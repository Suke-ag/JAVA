import java.lang.String;
import java.util.Scanner;

public class IndividualDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numSequence = sc.next();

        for(int i = 0;i<numSequence.length();i++){
            System.out.print(numSequence.charAt(i) + " ");
        }
        sc.close();
    }
}
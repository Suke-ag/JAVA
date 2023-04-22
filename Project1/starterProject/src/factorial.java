public class factorial {
    public static void main(String[] args) {
        int factorial = fact(0);
        System.out.println(factorial);
    }

    public static int fact(int n) {
        int fact = 1;
        int number = n;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

}

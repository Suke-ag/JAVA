// Sum of n fibbonacci series
public class FibonacciSum {
    public static void main(String[] args) {
        int num = fib(10);
        System.out.println(num);
    }

    public static int fib(int n){
        if (n==1)
            return 0;
        if(n == 2)
            return 1;
        if (n!=0 && n>0){
            return fib(n-1)+fib(n-2);
        }
        return 0;
    }
}

public class ReversedNumber {
    public static void main(String[] args) {
        int n = 123;
        int reversedNumber = 0;
        
        // for(;n!=0;n=n/10){
        // int onesPlace = n%10;
        // reversedNumber = reversedNumber*10 + onesPlace;
        // }

        // while (n != 0) {
        //     int remainder = n % 10;
        //     reversedNumber = reversedNumber * 10 + remainder;
        //     n /= 10;
        // }

        do{
            int remainder = n % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            n /= 10;
        }while(n!=0);

        System.out.println(reversedNumber);
    }
}

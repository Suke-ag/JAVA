import billmanagment.BillDetails;

import java.util.Scanner;

public class AmountTypeCasting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the billId:         ");
        int billId = sc.nextInt();
        System.out.print("Enter the customer Id:  ");
        int customerId = sc.nextInt();
        System.out.print("Enter the discount:     ");
        int discount = sc.nextInt();
        System.out.print("Enter the Bill amount:  ");
        double billAmount = sc.nextDouble();

        BillDetails obj = new BillDetails();

        obj.setBillId(billId);
        obj.setCustomerId(customerId);
        obj.setDiscount(discount);
        obj.setBillAmount(billAmount);

        obj.clearScreen();

        System.out.println("\nBill Id:        "+obj.getBillId());
        System.out.println("\nCustomer Id:    "+obj.getCustomerId());
        System.out.println("\nDiscount:       "+obj.getDiscount());
        System.out.println("\nBill amount:    "+obj.getBillAmount());
        System.out.println("\nBill amount after Discount: "+obj.getDiscountedBillAmount());

        sc.close();
    }
}
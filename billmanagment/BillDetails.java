package billmanagment;

public class BillDetails {
    private int billId;
        private int customerId;
        private int discount;
        private double billAmount;
        private double discountedBillAmount;

        public void clearScreen() {   
            System.out.print("\033[H\033[2J");   
            System.out.flush();   
           } 

        public int getBillId() {
            return billId;
        }

        public int getCustomerId() {
            return customerId;
        }

        public int getDiscount() {
            return discount;
        }

        public double getBillAmount() {
            return billAmount;
        }

        public double getDiscountedBillAmount() {
            discountedBillAmount = billAmount-billAmount*discount/100;
            return discountedBillAmount;
        }

        public void setBillId(int billId) {
            this.billId = billId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }

        public void setBillAmount(double billAmount) {
            this.billAmount = billAmount;
        }
}
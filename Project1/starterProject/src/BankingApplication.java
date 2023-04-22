

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount obj = new BankAccount("Suresh", "1001");
        obj.showMenu();
        sc.close();
    }
}

class BankAccount {
    int balance;
    int previousTranscation;
    String customerName;
    String customerId;

    BankAccount(String cName, String cId) {
        customerName = cName;
        customerId = cId;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTranscation = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTranscation = -amount;
        }
    }

    void getPrevoiusTranscation() {
        if (previousTranscation > 0) {
            System.out.println("Deposited: " + previousTranscation);
        } else if (previousTranscation < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTranscation));
        } else {
            System.out.println("No Transcation is occoured");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your Id is: " + customerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("=========================================");
            System.out.println("Enter the option");
            System.out.println("=========================================");
            option = sc.next().charAt(0);

            option = Character.toUpperCase(option);

            switch (option) {
                case 'A':
                    System.out.println("=========================================");
                    System.out.println("Balance is: " + balance);
                    System.out.println("=========================================");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("=========================================");
                    System.out.println("Enter the amount to deposit:");
                    System.out.println("=========================================");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("=========================================");
                    System.out.println("Enter the amount to Withdraw:");
                    System.out.println("=========================================");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("=========================================");
                    getPrevoiusTranscation();
                    System.out.println("=========================================");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("=========================================");
                    break;
                default:
                    System.out.println("Invalid option! Please Choose valid option");
            }
        } while (option != 'E');
        sc.close();
    }
}

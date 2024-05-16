package ATMMachine;
import java.util.*;

class ATM {
    float Balance;
    int PIN = 1234;

    public void checkpin() {
        System.out.println("Enter your ATM pin: ");
        Scanner s = new Scanner(System.in);
        int enteredpin = s.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid Pin");
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter Your Choices: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner s = new Scanner(System.in);
        int opt = s.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
            menu();
        }
    }


    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
            menu();
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successfully");
            menu();
        }
    }

    public void depositMoney() {
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class main {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
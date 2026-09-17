package hometask;

import java.util.Arrays;
import java.util.Random;

public class CreditCards {
    String accountNumber;
    double balance;

    CreditCards(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Random random = new Random();

        CreditCards[] cards = new CreditCards[3];
        for (int index = 0; index < cards.length; index++) {
            cards[index] = new CreditCards(generateAccountNumber(random), random.nextInt(2000));
        }

        System.out.println();
        for (CreditCards card : cards) {
            card.displayInfo();
        }
        cards[0].deposit(random.nextInt(100));
        cards[1].deposit( random.nextInt(100));

        double withdrawAmount = random.nextInt(100);
        cards[2].withdraw(withdrawAmount);

        System.out.println("Итоговое состояние карт:");
        for (CreditCards card : cards) {
            card.displayInfo();
        }
    }
       private static String generateAccountNumber(Random random) {
        return String.format("%04d-%04d-%04d-%04d",
                random.nextInt(10000), random.nextInt(10000), random.nextInt(10000), random.nextInt(10000));
    }
    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        return true;
    }
}

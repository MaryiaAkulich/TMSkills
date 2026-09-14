package hometask;

import java.util.Random;

public class ATM {
    int count20;
    int count50;
    int count100;

    ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public static void main(String[] args) {
        Random random = new Random();
        ATM atm = new ATM(random.nextInt(100), random.nextInt(100), random.nextInt(100));

        System.out.println("Начальное состояние банкомата:");
        atm.displayInfo();

        atm.addMoney(random.nextInt(100), random.nextInt(100), random.nextInt(100));

        System.out.println("Состояние после пополнения:");
        atm.displayInfo();

        int withdrawAmount = random.nextInt(50);
        boolean success = atm.withdraw(withdrawAmount);
        System.out.println("Результат снятия " + withdrawAmount + ": " + success);
        System.out.println();

        System.out.println("Итоговое состояние банкомата:");
        atm.displayInfo();
    }

    @Override
    public String toString() {
        return "ATM{" +
                "count20=" + count20 +
                ", count50=" + count50 +
                ", count100=" + count100 +
                ", total=" + (count20 * 20 + count50 * 50 + count100 * 100) +
                '}';
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }

    public void addMoney(int count20, int count50, int count100) {
        this.count20 += count20;
        this.count50 += count50;
        this.count100 += count100;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            return false;
        }
        System.out.println("Невозможно выдать сумму " + amount + " имеющимися купюрами.");
        return false;
    }
}
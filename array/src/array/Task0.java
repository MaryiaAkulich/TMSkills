package array;

import java.util.Scanner;

public class Task0 {
    public static void main() {
        int[] array = {1, 3, 5, 22, 27, 17, 85, 13, 30, 14};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выведите число для поиска: ");

        int number = scanner.nextInt();
        boolean found = false;
        for (int value : array) {
            if (value == number) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Число входит в массив.");
        } else {
            System.out.println("Число  не входит в массив.");
        }

    }
}


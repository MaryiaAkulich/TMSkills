package array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main() {
        int[] array = {1, 2, 13, 52, 35, 62, 7};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для удаления: ");
        int number = scanner.nextInt();

        int count = 0;
        for (int value : array) {
            if (value == number) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Число " + number + " не найдено в массиве.");
        } else {
            int[] newArray = new int[array.length - count];
            int count2 = 0;

            for (int value : array) {
                if (value != number) {
                    newArray[count2] = value;
                    count2++;
                }
            }
            System.out.println("Исходный массив: " + Arrays.toString(array));
            System.out.println("Новый массив без числа " + number + ": " + Arrays.toString(newArray));
        }
    }
}
package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();

        for (int index = 0; index < array.length; index++)
            array[index] = random.nextInt(100);
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        int min = array [0];
        int max = array [0];
        int sum = 0;
        for (int value : array) {
            if (min > value) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
            sum += value;
        }
        double average = (double) sum / size;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }
}




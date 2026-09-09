package array;

import java.util.Arrays;

public class Task3 {
    public static void main() {
        int[] array1 = {1, 8, 15, 16, 23};
        int[] array2 = {2, 100, 33, 18, 10};

        System.out.println("Массив 1:" + Arrays.toString(array1));
        System.out.println("Массив 2:" + Arrays.toString(array2));

        int sum1 = 0;
        int size1 = 5;
        for (int value : array1) {
            sum1 += value;
        }
        double average1 = (double) sum1 / size1;

        int sum2 = 0;
        int size2 = 5;
        for (int value : array2) {
            sum2 += value;
        }
        double average2 = (double) sum2 / size2;

        System.out.println("Среднее арифметическое первого массива: " + average1);
        System.out.println("Среднее арифметическое второго массива: " + average2);

        if (average1 > average2) {
            System.out.println("Среднее арифметическое первого массива больше.");
        } else if (average2 > average1) {
            System.out.println("Среднее арифметическое второго массива больше.");
        } else {
            System.out.println("Средние арифметические массивов равны.");
        }
    }
}




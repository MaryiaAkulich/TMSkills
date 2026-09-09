package multiarray;

import java.util.Arrays;

public class Task3 {
    public static void main() {
        int[][] array = {
                {5, 2, 8, 1},
                {9, 3, 7, 4, 6},
                {10, 0, -3, 15, 2}
        };

        System.out.println("Исходный массив:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        long sum = 0;
        for (int[] row : array) {
            for (int value : row) {
                sum += value;
            }
        }

        System.out.println("Сумма всех элементов массива: " + sum);
    }
}


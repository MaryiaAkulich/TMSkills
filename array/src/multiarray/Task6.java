package multiarray;

import java.util.Arrays;

public class Task6 {
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

        for (int index = 0; index < array.length; index++) {
            Arrays.sort(array[index]);
        }

        System.out.println("Отсортированный массив:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}

package array;

import java.util.Arrays;

public class Task5 {
    public static void main() {
        int[] array = {10, 21, 33, 45, 56, 67, 78, 89};

        System.out.println("Исходный массив: " + Arrays.toString(array));

        for (int index = 0; index < array.length; index++) {
            if (index % 2 != 0) {
                array[index] = 0;
            }
        }

        System.out.println("Обновлённый массив: " + Arrays.toString(array));
    }
}
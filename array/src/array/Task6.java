package array;

import java.util.Arrays;

public class Task6 {
    public static void main() {
        String[] names = {"Дмитрий", "Анна", "Василий", "Виктор", "Елена", "Борис"};

        Arrays.sort(names);

        System.out.println("Отсортированный массив имён:" + Arrays.toString(names));
    }
}
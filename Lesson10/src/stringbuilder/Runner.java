package stringbuilder;

import java.util.Scanner;

public class Runner {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во строк : ");

        int number = Integer.parseInt(scanner.nextLine());
        String[] lines = new String[number];
        System.out.println("Введите строчки ");
        for (int index = 0; index < number; index++) {

            lines[index] = scanner.nextLine();

        }
        String shortest = lines[0];
        String longest = lines[0];
        for (int index = 0; index < number; index++) {
            if (lines[index].length() < shortest.length()) {
                shortest = lines[index];
            }
            if (lines[index].length() > longest.length()) {
                longest = lines[index];

            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append( "Самая короткая строка: ").append(shortest).append(". длина строки: ").append(shortest.length());
        sb.append( "\nСамая длинная строка: ").append(longest).append(". длина строки: ").append(longest.length());
        System.out.println(sb.toString());
    }
}
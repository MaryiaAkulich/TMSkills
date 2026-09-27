package WordFinder;

import java.util.Scanner;

public class Runner {
    public static void main() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите предложение: ");

            String text = scanner.nextLine();

        String[] words = text.split(" ");

            String shortest = words[0];
            String longest = words[0];

            for (int index = 0; index < words.length; index++) {
                if (words[index].length() <= shortest.length()) {
                    shortest = words[index];
                }
                if (words[index].length() >= longest.length()) {
                    longest = words[index];
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Самое короткое слово: ").append(shortest).append(". длина слова: ").append(shortest.length());
            sb.append("\nСамое длинное слово: ").append(longest).append(". длина слова: ").append(longest.length());
            System.out.println(sb.toString());
        }
    }
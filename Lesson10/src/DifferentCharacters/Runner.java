package DifferentCharacters;

import java.util.Scanner;

public class Runner {

    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите предложение: ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");

        String result = words[0];
        int minDifferentCharacters = countDifferentCharacters(words[0]);

        for (int index = 1; index < words.length; index++) {

            int currentDifferentCharacters =
                    countDifferentCharacters(words[index]);

            if (currentDifferentCharacters < minDifferentCharacters) {
                minDifferentCharacters = currentDifferentCharacters;
                result = words[index];
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("Искомое слово: ").append(result).append(". Количество различных символов: ").append(minDifferentCharacters);

        System.out.println(sb.toString());
    }

    public static int countDifferentCharacters(String word) {

        String differentCharacters = "";

        for (int index = 0; index < word.length(); index++) {

            char symbol = word.charAt(index);

            if (differentCharacters.indexOf(symbol) == -1) {
                differentCharacters += symbol;
            }
        }

        return differentCharacters.length();
    }
}
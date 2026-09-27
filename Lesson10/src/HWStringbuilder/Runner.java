package HWStringbuilder;

public class Runner {
        public static void main() {

            String documentNumber = "5555-abc-1234-ABC-1a2b";

            System.out.println("Номер документа:");
            System.out.println(documentNumber);

            System.out.println();

            System.out.println("1. Два первых блока:");
            DocumentProcessor.printFirstBlocks(documentNumber);

            System.out.println();

            System.out.println("2. Документ со звёздочками:");
            DocumentProcessor.printWithStars(documentNumber);

            System.out.println();

            System.out.println("3. Только буквы:");
            DocumentProcessor.printLetters(documentNumber);

            System.out.println();

            System.out.println("4. Буквы через StringBuilder:");
            DocumentProcessor.printLettersUpperCase(documentNumber);

            System.out.println();

            System.out.println("5. Проверка abc:");
            DocumentProcessor.checkAbc(documentNumber);

            System.out.println();

            System.out.println("6. Проверка начала:");
            DocumentProcessor.checkStart(documentNumber);

            System.out.println();

            System.out.println("7. Проверка окончания:");
            DocumentProcessor.checkEnd(documentNumber);
        }
    }

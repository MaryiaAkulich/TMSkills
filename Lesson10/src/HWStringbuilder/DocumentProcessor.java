package HWStringbuilder;

public class DocumentProcessor {

    public static void printFirstBlocks(String documentNumber) {

        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + " " + blocks[2]);
    }

    public static void printWithStars(String documentNumber) {

        String result = documentNumber.replaceAll("[A-Za-z]{3}", "***");

        System.out.println(result);
    }

    public static void printLetters(String documentNumber) {

        String[] blocks = documentNumber.split("-");

        String result = blocks[1] + "/"
                + blocks[3] + "/"
                + blocks[4].charAt(1) + "/"
                + blocks[4].charAt(3);

        System.out.println(result.toLowerCase());
    }


    public static void printLettersUpperCase(String documentNumber) {

        String[] blocks = documentNumber.split("-");

        StringBuilder result = new StringBuilder();

        result.append("Letters:").append(blocks[1]).append("/").append(blocks[3]).append("/").append(blocks[4].charAt(1)).append("/").append(blocks[4].charAt(3));

        System.out.println(result.toString().toUpperCase());
    }

    public static void checkAbc(String documentNumber) {

        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println(
                    "Номер документа содержит последовательность \"abc\"."
            );
        } else {
            System.out.println(
                    "Номер документа не содержит последовательность \"abc\"."
            );
        }
    }


    public static void checkStart(String documentNumber) {

        if (documentNumber.startsWith("555")) {
            System.out.println(
                    "Номер документа начинается с последовательности \"555\"."
            );
        } else {
            System.out.println(
                    "Номер документа не начинается с последовательности \"555\"."
            );
        }
    }


    public static void checkEnd(String documentNumber) {

        if (documentNumber.endsWith("1a2b")) {
            System.out.println(
                    "Номер документа заканчивается последовательностью \"1a2b\"."
            );
        } else {
            System.out.println(
                    "Номер документа не заканчивается последовательностью \"1a2b\"."
            );
        }
    }
}


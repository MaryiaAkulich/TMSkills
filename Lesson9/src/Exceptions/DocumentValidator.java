package Exceptions;

public class DocumentValidator {

    public static void checkAbc(String documentNumber)
            throws NoABCException {

        if (!documentNumber.contains("abc")) {
            throw new NoABCException(
                    "Номер документа не содержит последовательность \"abc\"."
            );
        }
    }

    public static void checkStart(String documentNumber)
            throws NotStartsWith555Exception {

        if (!documentNumber.startsWith("555")) {
            throw new NotStartsWith555Exception(
                    "Номер документа не начинается с последовательности \"555\"."
            );
        }
    }

    public static void checkEnd(String documentNumber)
            throws NotEndsWith1A2BException {

        if (!documentNumber.endsWith("1a2b")) {
            throw new NotEndsWith1A2BException(
                    "Номер документа не заканчивается последовательностью \"1a2b\"."
            );
        }
    }

    public static void DocumentValidator (String documentNumber) {

        try {
            checkAbc(documentNumber);
            System.out.println("Проверка \"abc\": пройдена.");

        } catch (NoABCException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            checkStart(documentNumber);
            System.out.println("Проверка начала \"555\": пройдена.");

        } catch (NotStartsWith555Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            checkEnd(documentNumber);
            System.out.println("Проверка окончания \"1a2b\": пройдена.");

        } catch (NotEndsWith1A2BException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
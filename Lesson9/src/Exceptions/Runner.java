package Exceptions;

import java.util.Random;

public class Runner {

  public static String generateDocument() {

                    Random random = new Random();

                    String[] starts = {"555", "123", "777", "999" };

                    String[] middle = {"abc", "xyz", "123", "abc123"};

                    String[] ends = {"1a2b", "2b3c","abcd", "5678"};

                    String start = starts[random.nextInt(starts.length)];
                    String middlePart = middle[random.nextInt(middle.length)];
                    String end = ends[random.nextInt(ends.length)];

                    return start + middlePart + end;
                }

                public static void main() {

                    String documentNumber = generateDocument();

                    System.out.println("Сгенерированный номер документа:");
                    System.out.println(documentNumber);
                    System.out.println();

                    DocumentValidator.DocumentValidator(documentNumber);
                }
            }
package Exceptions;

import java.util.Random;

public class Document {

        private final Random random = new Random();

        private final String[] startsNumbers = {"555", "123", "777"};
        private final String[] startsLetters = {"abc", "xyz", "qwe"};
        private final String[] ends = {"1a2b", "9999", "0000"};

        public String generate() {
            return startsNumbers[random.nextInt(startsNumbers.length)]
                    + "-" + startsLetters[random.nextInt(startsLetters.length)]
                    + "-" + ends[random.nextInt(ends.length)];
        }
    }

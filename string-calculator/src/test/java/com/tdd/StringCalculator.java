package com.tdd;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    public static Integer calculate(String string) {
        if (checkNullOrEmpty(string)) {
            return 0;
        }

        List<String> numbers = getSplitedNumbers(string);

        int total = numbers.stream().mapToInt(s -> {
            try {
                if (checkNullOrEmpty(s)) {
                    return 0;
                }

                int number = Integer.parseInt(s);

                if (number < 0) {
                    throw new Exception("number < 0");
                }

                return number;
            } catch (Exception e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }).sum();

        return total;
    }

    private static List<String> getSplitedNumbers(String string) {
        return Arrays.asList(string.split("[,:]"));
    }

    private static Boolean checkNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
}

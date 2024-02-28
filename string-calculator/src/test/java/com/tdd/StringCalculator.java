package com.tdd;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    public static Integer calculate(String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }

        List<String> numbers = Arrays.asList(string.split("[,:]"));


        return numbers.stream().mapToInt(s -> {
            try {
                if (s == null || s.isEmpty()) {
                    return 0;
                }

                int number = Integer.parseInt(s);

                if (number < 0) {
                    throw new Exception("number < 0");
                }

                return number;
            } catch(Exception e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }).sum();
    }
}

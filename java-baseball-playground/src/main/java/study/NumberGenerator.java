package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    Random random = new Random();

    public List<Integer> generate(int size, int start, int end) {
        List<Integer> numbers = new ArrayList<>();
        random.ints(size, start, end).forEach(number -> numbers.add(number));
        return numbers;
    }
}

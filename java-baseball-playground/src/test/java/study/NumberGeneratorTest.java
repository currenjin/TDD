package study;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NumberGeneratorTest {

    NumberGenerator numberGenerator = new NumberGenerator();

    // 숫자를 생성해주자. v
    // 입력한 수만큼 생성된다. v
    // 입력한 범위만큼 생성된다. v
    // 범위를 입력하지 않으면 에러가 발생한다. (later)
    // 개수를 입력하지 않으면 에러가 발생한다. (later)

    @Test
    void generate_size_test() {
        List<Integer> numbers = numberGenerator.generate(3, 1, 9);

        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    void generate_range_test() {
        List<Integer> numbers = numberGenerator.generate(3, 1, 9);

        numbers.forEach(number -> {
            assertThat(number).isGreaterThan(0);
            assertThat(number).isLessThan(10);
        });
    }
}
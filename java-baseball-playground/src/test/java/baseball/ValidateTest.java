package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateTest {

    @Test
    void 숫자_1_9_사이인지_검증() {
        assertThat(Validator.verifyNo(1)).isTrue();
        assertThat(Validator.verifyNo(9)).isTrue();
        assertThat(Validator.verifyNo(0)).isFalse();
        assertThat(Validator.verifyNo(10)).isFalse();
    }
}

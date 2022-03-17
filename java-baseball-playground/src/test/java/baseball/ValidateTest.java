package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateTest {

    @Test
    void 숫자_1_9_사이인지_검증() {
        assertThat(Validator.validNo(1)).isTrue();
        assertThat(Validator.validNo(9)).isTrue();
        assertThat(Validator.validNo(0)).isFalse();
        assertThat(Validator.validNo(10)).isFalse();
    }
}

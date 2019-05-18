import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem03Test {
    @Test
    public void checkValidValue() {
        int result = new Problem03().solve();
        Assertions.assertThat(result).isEqualTo(6857);
    }
}

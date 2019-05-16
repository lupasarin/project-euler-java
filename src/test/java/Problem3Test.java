import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem3Test {
    @Test
    public void checkValidValue() {
        int result = new Problem3().solve();
        Assertions.assertThat(result).isEqualTo(6857);
    }
}

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem1Test {
    @Test
    public void checkValidValue() {
        int result = new Problem1().solve();
        Assertions.assertThat(result).isEqualTo(233168);
    }
}

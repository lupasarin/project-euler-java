import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem05Test {
    @Test
    public void checkValidValue() {
        int result = new Problem05().solve();
        Assertions.assertThat(result).isEqualTo(232792560);
    }
}

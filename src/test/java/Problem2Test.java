import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem2Test {
    @Test
    public void checkValidValue() {
        int result = new Problem2().solve();
        Assertions.assertThat(result).isEqualTo(4613732);
    }
}

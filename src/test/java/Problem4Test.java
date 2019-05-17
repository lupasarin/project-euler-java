import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem4Test {
    @Test
    public void checkValidValue() {
        int result = new Problem4().solve();
        Assertions.assertThat(result).isEqualTo(906609);
    }
}

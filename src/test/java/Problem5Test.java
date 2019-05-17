import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem5Test {
    @Test
    public void checkValidValue() {
        int result = new Problem5().solve();
        Assertions.assertThat(result).isEqualTo(232792560);
    }
}

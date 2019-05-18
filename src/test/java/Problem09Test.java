import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem09Test {
    @Test
    public void checkValidValue() {
        int result = new Problem09().solve();
        Assertions.assertThat(result).isEqualTo(31875000);
    }
}

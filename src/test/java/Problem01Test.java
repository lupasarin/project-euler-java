import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem01Test {
    @Test
    public void checkValidValue() {
        int result = new Problem01().solve();
        Assertions.assertThat(result).isEqualTo(233168);
    }
}

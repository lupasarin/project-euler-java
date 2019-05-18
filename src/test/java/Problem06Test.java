import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem06Test {
    @Test
    public void checkValidValue() {
        int result = new Problem06().solve();
        Assertions.assertThat(result).isEqualTo(25164150);
    }
}

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem10Test {
    @Test
    public void checkValidValue() {
        long result = new Problem10().solve();
        Assertions.assertThat(result).isEqualTo(142913828922L);
    }
}

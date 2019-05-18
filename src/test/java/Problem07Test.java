import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem07Test {
    @Test
    public void checkValidValue() {
        int result = new Problem07().solve();
        Assertions.assertThat(result).isEqualTo(104743);
    }
}

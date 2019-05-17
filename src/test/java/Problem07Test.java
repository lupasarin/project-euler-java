import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem7Test {
    @Test
    public void checkValidValue() {
        int result = new Problem7().solve();
        Assertions.assertThat(result).isEqualTo(104743);
    }
}

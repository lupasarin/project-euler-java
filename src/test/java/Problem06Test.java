import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem6Test {
    @Test
    public void checkValidValue() {
        int result = new Problem6().solve();
        Assertions.assertThat(result).isEqualTo(25164150);
    }
}

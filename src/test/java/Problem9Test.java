import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem9Test {
    @Test
    public void checkValidValue() {
        int result = new Problem9().solve();
        Assertions.assertThat(result).isEqualTo(31875000);
    }
}

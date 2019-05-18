import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem04Test {
    @Test
    public void checkValidValue() {
        int result = new Problem04().solve();
        Assertions.assertThat(result).isEqualTo(906609);
    }
}

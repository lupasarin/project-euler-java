import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem02Test {
    @Test
    public void checkValidValue() {
        int result = new Problem02().solve();
        Assertions.assertThat(result).isEqualTo(4613732);
    }
}

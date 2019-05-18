import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem08Test {
    @Test
    public void checkValidValue() {
        long result = new Problem08().solve();
        Assertions.assertThat(result).isEqualTo(23514624000L);
    }
}

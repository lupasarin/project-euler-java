import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Problem8Test {
    @Test
    public void checkValidValue() {
        long result = new Problem8().solve();
        Assertions.assertThat(result).isEqualTo(23514624000L);
    }
}

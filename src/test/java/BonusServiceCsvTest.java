import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa55.BonusService;

public class BonusServiceCsvTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculateForRegisteredAndUnderLimit(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, isRegistered);
        Assertions.assertEquals(expected, actual);
    }
}

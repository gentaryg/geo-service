import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLocalizationServiceImpl {

    @Test
    public void testLocaleRussia() {
        LocalizationService local = new LocalizationServiceImpl();
        String expected = local.locale(Country.RUSSIA);
        String result = "Добро пожаловать";
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @EnumSource(value = Country.class, names = {"USA", "BRAZIL", "GERMANY"})
    public void testLocaleForWelcome(Country country) {
        LocalizationService local = new LocalizationServiceImpl();
        String expected = local.locale(country);
        String result = "Welcome";
        assertEquals(expected, result);
    }

}

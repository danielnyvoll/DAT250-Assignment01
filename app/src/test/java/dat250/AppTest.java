/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dat250;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testConvertInchesToMeters() {
        double result = App.convertUnits("in", "m", 12.0);
        assertEquals(12.0 * App.IN_TO_METER, result);
    }

    @Test
    void testConvertFeetToMeters() {
        double result = App.convertUnits("ft", "m", 5.0);
        assertEquals(5.0 * App.FT_TO_METER, result);
    }
}

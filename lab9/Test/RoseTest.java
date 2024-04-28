import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoseTest {

    @Test
    void getName() {
        Rose rose = new Rose("Rose","Red",30,8,"romantic love");
        assertEquals("Rose",rose.getName());
    }

    @Test
    void testToString() {
        Rose rose = new Rose("Rose","Red",30,8,"romantic love");
        assertEquals("The flower represents: romantic love",rose.toString());
    }
}
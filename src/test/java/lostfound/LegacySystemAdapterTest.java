package lostfound;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LegacySystemAdapterTest {

    @Test
    void testRegisterItemThroughAdapter() {
        OldLostFoundSystem oldSystem = new OldLostFoundSystem();
        TrackingService adapter = new LegacySystemAdapter(oldSystem);

        String result = adapter.registerItem("Phone", "205");

        assertEquals(
                "Legacy system: Phone registered successfully",
                result
        );
    }

    @Test
    void testInvalidLocation() {
        OldLostFoundSystem oldSystem = new OldLostFoundSystem();
        TrackingService adapter = new LegacySystemAdapter(oldSystem);

        assertThrows(
                IllegalArgumentException.class,
                () -> adapter.registerItem("Laptop", "Room A")
        );
    }
}
package lostfound;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrackingServiceSelectorTest {

    @Test
    void testDatabaseSelection() {
        TrackingService service = TrackingServiceSelector.select("database");

        assertInstanceOf(DatabaseTrackingService.class, service);
    }

    @Test
    void testQRSelection() {
        TrackingService service = TrackingServiceSelector.select("qr");

        assertInstanceOf(QRTrackingService.class, service);
    }

    @Test
    void testLegacySelection() {
        TrackingService service = TrackingServiceSelector.select("legacy");

        assertInstanceOf(LegacySystemAdapter.class, service);
    }

    @Test
    void testUnknownSelection() {
        assertThrows(
                IllegalArgumentException.class,
                () -> TrackingServiceSelector.select("unknown")
        );
    }
}
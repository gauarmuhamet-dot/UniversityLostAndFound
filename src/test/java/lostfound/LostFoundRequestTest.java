package lostfound;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LostFoundRequestTest {

    @Test
    void testLostItemWithDatabase() {
        TrackingService service = new DatabaseTrackingService();
        LostFoundRequest request = new LostItemRequest(service);

        String result = request.process("Laptop", "101");

        assertEquals(
                "LOST ITEM -> Database: Laptop registered at 101",
                result
        );
    }

    @Test
    void testFoundItemWithQR() {
        TrackingService service = new QRTrackingService();
        LostFoundRequest request = new FoundItemRequest(service);

        String result = request.process("Phone", "205");

        assertEquals(
                "FOUND ITEM -> QR System: Phone registered at 205",
                result
        );
    }
}
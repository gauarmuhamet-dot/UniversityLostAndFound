package lostfound;

public class QRTrackingService implements TrackingService {

    @Override
    public String registerItem(String itemName, String location) {
        return "QR System: " + itemName + " registered at " + location;
    }

    @Override
    public String findItem(String itemId) {
        return "QR System: scanning QR code for item " + itemId;
    }
}
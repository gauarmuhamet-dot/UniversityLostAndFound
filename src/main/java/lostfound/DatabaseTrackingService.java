package lostfound;

public class DatabaseTrackingService implements TrackingService {

    @Override
    public String registerItem(String itemName, String location) {
        return "Database: " + itemName + " registered at " + location;
    }

    @Override
    public String findItem(String itemId) {
        return "Database: searching for item " + itemId;
    }
}
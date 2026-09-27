package lostfound;

public interface TrackingService {

    String registerItem(String itemName, String location);

    String findItem(String itemId);
}
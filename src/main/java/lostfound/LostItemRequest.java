package lostfound;

public class LostItemRequest extends LostFoundRequest {

    public LostItemRequest(TrackingService trackingService) {
        super(trackingService);
    }

    @Override
    public String process(String itemName, String location) {
        return "LOST ITEM -> " +
                trackingService.registerItem(itemName, location);
    }
}
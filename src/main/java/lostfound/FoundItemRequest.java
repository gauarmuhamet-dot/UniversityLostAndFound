package lostfound;

public class FoundItemRequest extends LostFoundRequest {

    public FoundItemRequest(TrackingService trackingService) {
        super(trackingService);
    }

    @Override
    public String process(String itemName, String location) {
        return "FOUND ITEM -> " +
                trackingService.registerItem(itemName, location);
    }
}
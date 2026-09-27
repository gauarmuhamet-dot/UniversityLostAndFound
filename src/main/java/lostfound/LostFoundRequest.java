package lostfound;

public abstract class LostFoundRequest {

    protected TrackingService trackingService;

    public LostFoundRequest(TrackingService trackingService) {
        this.trackingService = trackingService;
    }

    public abstract String process(String itemName, String location);
}
package lostfound;

public class TrackingServiceSelector {

    public static TrackingService select(String type) {

        if (type == null) {
            throw new IllegalArgumentException("Tracking type cannot be null");
        }

        return switch (type.toLowerCase()) {
            case "database" -> new DatabaseTrackingService();

            case "qr" -> new QRTrackingService();

            case "legacy" ->
                    new LegacySystemAdapter(new OldLostFoundSystem());

            default ->
                    throw new IllegalArgumentException(
                            "Unknown tracking service: " + type
                    );
        };
    }
}
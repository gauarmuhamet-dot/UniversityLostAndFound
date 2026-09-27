package lostfound;

public class LegacySystemAdapter implements TrackingService {

    private final OldLostFoundSystem oldSystem;

    public LegacySystemAdapter(OldLostFoundSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public String registerItem(String itemName, String location) {
        int locationCode;

        try {
            locationCode = Integer.parseInt(location);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Location must be a numeric code");
        }

        int result = oldSystem.saveOldRecord(locationCode, itemName);

        if (result == -1) {
            throw new IllegalArgumentException("Item name cannot be empty");
        }

        if (result == -2) {
            throw new IllegalArgumentException("Invalid location");
        }

        return "Legacy system: " + itemName + " registered successfully";
    }

    @Override
    public String findItem(String itemId) {
        int itemCode;

        try {
            itemCode = Integer.parseInt(itemId);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Item ID must be numeric");
        }

        String result = oldSystem.searchByNumericCode(itemCode);

        if (result == null) {
            throw new IllegalArgumentException("Item not found");
        }

        return result;
    }
}
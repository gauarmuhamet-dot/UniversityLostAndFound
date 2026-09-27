package lostfound;

public class OldLostFoundSystem {

    public int saveOldRecord(int locationCode, String itemName) {
        if (itemName == null || itemName.isBlank()) {
            return -1;
        }

        if (locationCode <= 0) {
            return -2;
        }

        return 1;
    }

    public String searchByNumericCode(int itemCode) {
        if (itemCode <= 0) {
            return null;
        }

        return "Legacy system found item with code " + itemCode;
    }
}
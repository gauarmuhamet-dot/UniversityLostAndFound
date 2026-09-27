package lostfound;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== University Lost & Found System ===");

        System.out.print("Request type (lost/found): ");
        String requestType = scanner.nextLine();

        System.out.print("Tracking service (database/qr/legacy): ");
        String serviceType = scanner.nextLine();

        System.out.print("Item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Location: ");
        String location = scanner.nextLine();

        try {
            TrackingService service =
                    TrackingServiceSelector.select(serviceType);

            LostFoundRequest request;

            if (requestType.equalsIgnoreCase("lost")) {
                request = new LostItemRequest(service);
            } else if (requestType.equalsIgnoreCase("found")) {
                request = new FoundItemRequest(service);
            } else {
                throw new IllegalArgumentException("Unknown request type");
            }

            String result = request.process(itemName, location);

            System.out.println();
            System.out.println(result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
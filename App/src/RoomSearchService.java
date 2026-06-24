import java.util.*;

public class RoomSearchService {

    // Room Type -> Available Count
    private HashMap<String, Integer> roomInventory = new HashMap<>();

    // Room Type -> Price Per Night
    private HashMap<String, Double> roomPrices = new HashMap<>();

    // Room Type -> Amenities
    private HashMap<String, List<String>> roomAmenities = new HashMap<>();

    public RoomSearchService() {

        roomInventory.put("Single", 5);
        roomInventory.put("Double", 3);
        roomInventory.put("Suite", 0);

        roomPrices.put("Single", 2000.0);
        roomPrices.put("Double", 3500.0);
        roomPrices.put("Suite", 6000.0);

        roomAmenities.put("Single",
                Arrays.asList("WiFi", "TV"));

        roomAmenities.put("Double",
                Arrays.asList("WiFi", "TV", "AC"));

        roomAmenities.put("Suite",
                Arrays.asList("WiFi", "TV", "AC", "Mini Bar"));
    }

    // Display available rooms only
    public void searchAvailableRooms() {

        System.out.println("\nAvailable Rooms:");

        for (String roomType : roomInventory.keySet()) {

            int availableCount = roomInventory.get(roomType);

            if (availableCount > 0) {
                System.out.println("----------------------");
                System.out.println("Room Type : " + roomType);
                System.out.println("Available : " + availableCount);
                System.out.println("Price     : ₹" +
                        roomPrices.get(roomType));
                System.out.println("Amenities : " +
                        roomAmenities.get(roomType));
            }
        }
    }

    // Check room availability
    public boolean isRoomAvailable(String roomType) {

        return roomInventory.containsKey(roomType)
                && roomInventory.get(roomType) > 0;
    }

    // View room details
    public void viewRoomDetails(String roomType) {

        if (!roomInventory.containsKey(roomType)) {
            System.out.println("Invalid Room Type");
            return;
        }

        System.out.println("\nRoom Details");
        System.out.println("Room Type : " + roomType);
        System.out.println("Available : " +
                roomInventory.get(roomType));
        System.out.println("Price     : ₹" +
                roomPrices.get(roomType));
        System.out.println("Amenities : " +
                roomAmenities.get(roomType));

        if (!isRoomAvailable(roomType)) {
            System.out.println("Currently Not Available");
        }
    }
}
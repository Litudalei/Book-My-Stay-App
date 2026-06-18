import java.util.Map;

public class RoomSearchService {

    private RoomInventory inventory;

    public RoomSearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void displayAvailableRooms() {

        System.out.println("\n===== AVAILABLE ROOMS =====");

        for (Map.Entry<String, Integer> entry :
                inventory.getAllAvailability().entrySet()) {

            String roomType = entry.getKey();
            int availableCount = entry.getValue();

            if (availableCount > 0) {

                System.out.println("\nRoom Type : "
                        + roomType);

                System.out.println("Available Rooms : "
                        + availableCount);

                System.out.println("Price Per Night : ₹"
                        + inventory.getPrice(roomType));

                System.out.println("Amenities : "
                        + inventory.getAmenities(roomType));
            }
        }
    }

    public void searchRoom(String roomType) {

        System.out.println("\nSearching for : "
                + roomType);

        int availability =
                inventory.getAvailability(roomType);

        if (availability <= 0) {

            System.out.println("Room Not Available.");
            return;
        }

        System.out.println("Room Available");

        System.out.println("Available Count : "
                + availability);

        System.out.println("Price : ₹"
                + inventory.getPrice(roomType));

        System.out.println("Amenities : "
                + inventory.getAmenities(roomType));
    }
}

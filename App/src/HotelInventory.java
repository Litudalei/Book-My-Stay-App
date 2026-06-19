import java.util.*;

public class HotelInventory {

    private Map<String, Set<String>> availableRooms;

    public HotelInventory() {

        availableRooms = new HashMap<>();

        availableRooms.put("Single",
                new HashSet<>(Arrays.asList("S101", "S102", "S103")));

        availableRooms.put("Double",
                new HashSet<>(Arrays.asList("D201", "D202")));

        availableRooms.put("Suite",
                new HashSet<>(Arrays.asList("SU301")));
    }

    public Set<String> getAvailableRooms(String roomType) {
        return availableRooms.get(roomType);
    }

    public void removeRoom(String roomType, String roomId) {
        availableRooms.get(roomType).remove(roomId);
    }

    public void displayInventory() {

        System.out.println("\nAvailable Rooms:");

        for (Map.Entry<String, Set<String>> entry : availableRooms.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class RoomInventory {
    private Map<String, Integer> availabilityMap;
    private Map<String, Double> priceMap;
    private Map<String, String> amenitiesMap;

    public RoomInventory() {

        availabilityMap = new HashMap<>();
        priceMap = new HashMap<>();
        amenitiesMap = new HashMap<>();

        availabilityMap.put("Single Room", 10);
        availabilityMap.put("Double Room", 5);
        availabilityMap.put("Suite Room", 0);

        priceMap.put("Single Room", 2000.0);
        priceMap.put("Double Room", 3500.0);
        priceMap.put("Suite Room", 7000.0);

        amenitiesMap.put("Single Room",
                "WiFi, TV, AC");

        amenitiesMap.put("Double Room",
                "WiFi, TV, AC, Mini Fridge");

        amenitiesMap.put("Suite Room",
                "WiFi, TV, AC, Mini Bar, Jacuzzi");
    }

    public int getAvailability(String roomType) {
        return availabilityMap.getOrDefault(roomType, 0);
    }

    public double getPrice(String roomType) {
        return priceMap.getOrDefault(roomType, 0.0);
    }

    public String getAmenities(String roomType) {
        return amenitiesMap.getOrDefault(roomType,
                "No Amenities Available");
    }

    public Map<String, Integer> getAllAvailability() {
        return availabilityMap;
    }

}
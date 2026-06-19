import java.util.*;

public class BookingService {

    private Set<String> bookedRooms;

    private HotelInventory inventory;

    public BookingService(HotelInventory inventory) {
        this.inventory = inventory;
        this.bookedRooms = new HashSet<>();
    }

    public void bookRoom(String roomType) {

        Set<String> rooms = inventory.getAvailableRooms(roomType);

        if (rooms == null || rooms.isEmpty()) {

            System.out.println("No " + roomType + " rooms available.");
            return;
        }

        String assignedRoom = rooms.iterator().next();

        if (bookedRooms.contains(assignedRoom)) {

            System.out.println("Room already booked.");
            return;
        }

        bookedRooms.add(assignedRoom);

        inventory.removeRoom(roomType, assignedRoom);

        System.out.println(
                "Booking Confirmed! Assigned Room : "
                        + assignedRoom);
    }

    public void displayBookedRooms() {

        System.out.println("\nBooked Rooms:");

        System.out.println(bookedRooms);
    }
}

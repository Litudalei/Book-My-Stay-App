public class BookMyStayApplication {
    public static void main(String[] args) {  RoomSearchService service =
            new RoomSearchService();

    // Display all available rooms
        service.searchAvailableRooms();

    // Search specific room
        service.viewRoomDetails("Double");

    // Availability check
        if (service.isRoomAvailable("Suite")) {
        System.out.println("Suite can be booked.");
    } else {
        System.out.println("Suite is not available.");
    }
}
}

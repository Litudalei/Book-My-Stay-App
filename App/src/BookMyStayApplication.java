public class BookMyStayApplication {
    public static void main(String[] args) {   HotelInventory inventory = new HotelInventory();

        BookingService bookingService =
                new BookingService(inventory);

        inventory.displayInventory();

        System.out.println("\n===== BOOKINGS =====");

        bookingService.bookRoom("Single");

        bookingService.bookRoom("Single");

        bookingService.bookRoom("Double");

        bookingService.bookRoom("Suite");

        bookingService.bookRoom("Suite");

        bookingService.displayBookedRooms();

        inventory.displayInventory();
}
}

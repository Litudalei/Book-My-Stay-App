public class BookMyStayApplication {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println(" HOTEL BOOKING MANAGEMENT SYSTEM");
        System.out.println("           VERSION 4.0");
        System.out.println("==================================");

        RoomInventory inventory =
                new RoomInventory();

        RoomSearchService searchService =
                new RoomSearchService(inventory);

        searchService.displayAvailableRooms();

        searchService.searchRoom("Single Room");

        searchService.searchRoom("Suite Room");

        System.out.println("\nApplication Terminated.");

    }
}

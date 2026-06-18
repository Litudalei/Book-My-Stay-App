public class BookMyStayApplication {
    public static void main(String[] args) {
        System.out.println("welcome to hotel booking management system");
        System.out.println("System initialized successfully");
        // Room Objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static Availability Variables
        int singleRoomAvailability = 10;
        int doubleRoomAvailability = 5;
        int suiteRoomAvailability = 2;

        System.out.println("=================================");
        System.out.println(" HOTEL BOOKING MANAGEMENT SYSTEM ");
        System.out.println("         VERSION 2.0             ");
        System.out.println("=================================\n");

        System.out.println("Single Room Details");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: "
                + singleRoomAvailability);

        System.out.println("\n-----------------------------\n");

        System.out.println("Double Room Details");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: "
                + doubleRoomAvailability);

        System.out.println("\n-----------------------------\n");

        System.out.println("Suite Room Details");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: "
                + suiteRoomAvailability);

        System.out.println("\nApplication Terminated.");
    }
}

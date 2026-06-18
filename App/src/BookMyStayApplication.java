public class BookMyStayApplication {
    public static void main(String[] args) {
        System.out.println("welcome to hotel booking management system");
        System.out.println("System initialized successfully");
        RoomInventory inventory = new RoomInventory();

        System.out.println("\nInitial Inventory:");
        inventory.displayInventory();

        System.out.println("\nAvailability Checks:");
        System.out.println("Single Room : "
                + inventory.getAvailability("Single Room"));

        System.out.println("Double Room : "
                + inventory.getAvailability("Double Room"));

        System.out.println("Suite Room : "
                + inventory.getAvailability("Suite Room"));

        System.out.println("\nUpdating Inventory...");

        inventory.updateAvailability("Single Room", 8);
        inventory.updateAvailability("Double Room", 4);

        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();

        System.out.println("\nApplication Terminated.");

    }
}

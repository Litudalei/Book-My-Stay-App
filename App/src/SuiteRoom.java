class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 500.0, 7000.0);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room Type      : " + getRoomType());
        System.out.println("Beds           : " + getNumberOfBeds());
        System.out.println("Room Size      : " + getRoomSize() + " sq.ft");
        System.out.println("Price Per Night: ₹" + getPricePerNight());
    }
}

public class SingleRoom extends Room {

    public SingleRoom() {

        super(
                "S101",
                "Single Room",
                1,
                150.0,
                2000.0
        );
    }

    @Override
    public void displayRoomDetails() {

        System.out.println("Room Type : " + getRoomType());
        System.out.println("Beds : " + getNumberOfBeds());
        System.out.println("Room Size : " + getRoomSize());
        System.out.println("Price : ₹" + getPricePerNight());
    }
}
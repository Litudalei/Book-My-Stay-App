
public class DoubleRoom extends Room {

    public DoubleRoom() {

        super(
                "D101",
                "Double Room",
                2,
                250.0,
                3500.0
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

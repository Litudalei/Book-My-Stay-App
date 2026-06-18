
abstract class Room {

    private String roomType;
    private int numberOfBeds;
    private double roomSize;
    private double pricePerNight;

    public Room(String roomType, int numberOfBeds,
                double roomSize, double pricePerNight) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.roomSize = roomSize;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public abstract void displayRoomDetails();
}
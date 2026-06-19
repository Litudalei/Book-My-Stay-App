public abstract class Room {

    private String roomId;
    private String roomType;
    private int numberOfBeds;
    private double roomSize;
    private double pricePerNight;

    public Room(String roomId,
                String roomType,
                int numberOfBeds,
                double roomSize,
                double pricePerNight) {

        this.roomId = roomId;
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.roomSize = roomSize;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomId() {
        return roomId;
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
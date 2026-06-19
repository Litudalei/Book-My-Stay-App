public class Room {

    private String roomId;
    private String roomType;
    private boolean booked;

    public Room(String roomId, String roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.booked = false;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return roomId + " (" + roomType + ")";
    }
}
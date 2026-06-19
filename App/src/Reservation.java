public class Reservation {

    private String reservationId;
    private String guestName;
    private String roomId;
    private String status;

    public Reservation(String reservationId,
                       String guestName,
                       String roomId,
                       String status) {

        this.reservationId = reservationId;
        this.guestName = guestName;
        this.roomId = roomId;
        this.status = status;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation ID : " + reservationId +
                ", Guest : " + guestName +
                ", Room : " + roomId +
                ", Status : " + status;
    }
}

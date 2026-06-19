import java.util.ArrayList;
import java.util.List;

public class BookingHistoryService {

    private List<Reservation> reservations;

    public BookingHistoryService() {
        reservations = new ArrayList<>();
    }

    // Confirm Booking
    public void confirmBooking(
            Reservation reservation) {

        reservations.add(reservation);

        System.out.println(
                "Booking Confirmed : "
                        + reservation.getReservationId());
    }

    // Cancel Booking
    public void cancelBooking(
            String reservationId) {

        for (Reservation reservation : reservations) {

            if (reservation.getReservationId()
                    .equals(reservationId)) {

                reservation.setStatus("CANCELLED");

                System.out.println(
                        "Booking Cancelled : "
                                + reservationId);

                return;
            }
        }

        System.out.println(
                "Reservation Not Found");
    }

    // Display History
    public void displayBookingHistory() {

        System.out.println(
                "\n===== BOOKING HISTORY =====");

        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    // Generate Report
    public void generateReport() {

        int confirmed = 0;
        int cancelled = 0;

        for (Reservation reservation : reservations) {

            if ("CONFIRMED".equals(
                    reservation.getStatus())) {

                confirmed++;
            }

            if ("CANCELLED".equals(
                    reservation.getStatus())) {

                cancelled++;
            }
        }

        System.out.println(
                "\n===== REPORT =====");

        System.out.println(
                "Total Reservations : "
                        + reservations.size());

        System.out.println(
                "Confirmed : "
                        + confirmed);

        System.out.println(
                "Cancelled : "
                        + cancelled);
    }
}

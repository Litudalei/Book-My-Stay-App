public class BookMyStayApplication {
    public static void main(String[] args) {
        BookingHistoryService service =
                new BookingHistoryService();

        Reservation r1 =
                new Reservation(
                        "RES101",
                        "Gitiranjan",
                        "S101",
                        "CONFIRMED");

        Reservation r2 =
                new Reservation(
                        "RES102",
                        "Rahul",
                        "D201",
                        "CONFIRMED");

        Reservation r3 =
                new Reservation(
                        "RES103",
                        "Amit",
                        "SU301",
                        "CONFIRMED");

        service.confirmBooking(r1);
        service.confirmBooking(r2);
        service.confirmBooking(r3);

        service.cancelBooking("RES102");

        service.displayBookingHistory();

        service.generateReport();
}
}

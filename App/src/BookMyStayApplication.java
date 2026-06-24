public class BookMyStayApplication {
    public static void main(String[] args) {
        ServiceManagement serviceManager =
                new ServiceManagement();

        String reservationId = "RES101";

        Service breakfast =
                new Service(
                        "Breakfast",
                        500);

        Service spa =
                new Service(
                        "Spa",
                        2000);

        Service pickup =
                new Service(
                        "Airport Pickup",
                        1000);

        serviceManager.addService(
                reservationId,
                breakfast);

        serviceManager.addService(
                reservationId,
                spa);

        serviceManager.addService(
                reservationId,
                pickup);

        serviceManager.displayServices(
                reservationId);
}
}

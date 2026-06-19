import java.util.*;

public class ServiceManagement {

    private Map<String, List<Service>> reservationServices;

    public ServiceManagement() {
        reservationServices = new HashMap<>();
    }

    // Add Service to Reservation
    public void addService(String reservationId,
                           Service service) {

        reservationServices
                .computeIfAbsent(
                        reservationId,
                        k -> new ArrayList<>())
                .add(service);

        System.out.println(
                service.getServiceName()
                        + " added to "
                        + reservationId);
    }

    // Calculate Additional Cost
    public double calculateTotalServiceCost(
            String reservationId) {

        List<Service> services =
                reservationServices.get(reservationId);

        if (services == null) {
            return 0;
        }

        double total = 0;

        for (Service service : services) {
            total += service.getCost();
        }

        return total;
    }

    // Display Services
    public void displayServices(
            String reservationId) {

        List<Service> services =
                reservationServices.get(reservationId);

        if (services == null ||
                services.isEmpty()) {

            System.out.println(
                    "No services selected.");
            return;
        }

        System.out.println(
                "\nServices for "
                        + reservationId);

        for (Service service : services) {
            System.out.println(service);
        }

        System.out.println(
                "Total Service Cost = ₹"
                        + calculateTotalServiceCost(
                        reservationId));
    }
}

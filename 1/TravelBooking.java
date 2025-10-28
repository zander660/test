import java.util.ArrayList;

public class TravelBooking {
    private ArrayList<String> flights = new ArrayList<>();
    private ArrayList<String> hotels = new ArrayList<>();

    public void searchFlights(String destination) {
        System.out.println("Searching flights to " + destination + "...");
    }

    public void searchHotels(String location) {
        System.out.println("Searching hotels in " + location + "...");
    }

    public void bookFlight(String flight) {
        flights.add(flight);
        System.out.println("Booked flight: " + flight);
    }

    public void bookHotel(String hotel) {
        hotels.add(hotel);
        System.out.println("Booked hotel: " + hotel);
    }

    public void cancelFlight(String flight) {
        flights.remove(flight);
        System.out.println("Cancelled flight: " + flight);
    }

    public void cancelHotel(String hotel) {
        hotels.remove(hotel);
        System.out.println("Cancelled hotel: " + hotel);
    }

    public static void main(String[] args) {
        TravelBooking booking = new TravelBooking();
        booking.searchFlights("Paris");
        booking.bookFlight("Flight 101");
        booking.searchHotels("Paris");
        booking.bookHotel("Eiffel Stay");
        booking.cancelFlight("Flight 101");
        booking.cancelHotel("Eiffel Stay");
    }
}

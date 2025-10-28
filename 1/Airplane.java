public class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean delayed;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;
    }

    public void delayFlight() {
        delayed = true;
    }

    public void checkStatus() {
        if (delayed)
            System.out.println("Flight " + flightNumber + " to " + destination + " is delayed.");
        else
            System.out.println("Flight " + flightNumber + " to " + destination + " is on time.");
    }

    public static void main(String[] args) {
        Airplane flight = new Airplane("PR123", "Tokyo", "10:30 AM");
        flight.checkStatus();
        flight.delayFlight();
        flight.checkStatus();
    }
}


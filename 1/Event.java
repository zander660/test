class Event {
    protected String eventName;
    protected String date;
    protected String location;

    public Event(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Event: " + eventName + ", Date: " + date + ", Location: " + location);
    }
}

class WeddingEvent extends Event {
    private int guests;
    private double costPerGuest;

    public WeddingEvent(String eventName, String date, String location, int guests, double costPerGuest) {
        super(eventName, date, location);
        this.guests = guests;
        this.costPerGuest = costPerGuest;
    }

    public double calculateTotalCost() {
        return guests * costPerGuest;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Guests: " + guests + ", Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        WeddingEvent wedding = new WeddingEvent("Smith Wedding", "2025-12-10", "Manila Hotel", 120, 1500);
        wedding.displayDetails();
    }
}

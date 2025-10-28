class Building {
    protected String address;
    protected int floors;
    protected double totalArea;

    public Building(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }

    public void displayDetails() {
        System.out.println("Address: " + address + ", Floors: " + floors + ", Area: " + totalArea + " sqm");
    }
}

class ResidentialBuilding extends Building {
    private int apartments;
    private double rentPerApartment;

    public ResidentialBuilding(String address, int floors, double totalArea, int apartments, double rentPerApartment) {
        super(address, floors, totalArea);
        this.apartments = apartments;
        this.rentPerApartment = rentPerApartment;
    }

    public double calculateTotalRent() {
        return apartments * rentPerApartment;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Apartments: " + apartments + ", Total Rent: " + calculateTotalRent());
    }
}

class CommercialBuilding extends Building {
    private int offices;
    private double rentPerOffice;

    public CommercialBuilding(String address, int floors, double totalArea, int offices, double rentPerOffice) {
        super(address, floors, totalArea);
        this.offices = offices;
        this.rentPerOffice = rentPerOffice;
    }

    public double calculateTotalRent() {
        return offices * rentPerOffice;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Offices: " + offices + ", Total Rent: " + calculateTotalRent());
    }

    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding("123 Elm St", 5, 2000, 10, 15000);
        CommercialBuilding cb = new CommercialBuilding("456 Oak Ave", 8, 5000, 20, 30000);
        rb.displayDetails();
        cb.displayDetails();
    }
}

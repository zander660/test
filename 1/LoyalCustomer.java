import java.util.ArrayList;

class Customer {
    protected String name;
    protected String email;
    protected ArrayList<Double> purchases = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addPurchase(double amount) {
        purchases.add(amount);
    }

    public double getTotalExpenditure() {
        double total = 0;
        for (double p : purchases) total += p;
        return total;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Email: " + email);
        System.out.println("Total Expenditure: " + getTotalExpenditure());
    }
}

class LoyalCustomer extends Customer {
    private double discountRate;

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    public double applyDiscount(double amount) {
        return amount - (amount * discountRate / 100);
    }

    public static void main(String[] args) {
        LoyalCustomer lc = new LoyalCustomer("Anna", "anna@email.com", 10);
        lc.addPurchase(lc.applyDiscount(500));
        lc.addPurchase(lc.applyDiscount(200));
        lc.displayInfo();
    }
}

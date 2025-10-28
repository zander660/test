class ElectronicsProduct {
    protected String productID;
    protected String name;
    protected double price;

    public ElectronicsProduct(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public double applyDiscount(double percent) {
        return price - (price * percent / 100);
    }

    public void displayDetails() {
        System.out.println("Product: " + name + ", ID: " + productID + ", Price: " + price);
    }
}

class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod;

    public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void extendWarranty(int years) {
        warrantyPeriod += years;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("WM101", "LG TurboWash", 25000, 2);
        wm.displayDetails();
        wm.extendWarranty(1);
        wm.displayDetails();
    }
}

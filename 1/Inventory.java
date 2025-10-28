import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> products = new HashMap<>();

    public void addProduct(String name, int quantity) {
        products.put(name, products.getOrDefault(name, 0) + quantity);
    }

    public void removeProduct(String name) {
        products.remove(name);
    }

    public void checkLowInventory(int threshold) {
        for (String name : products.keySet()) {
            if (products.get(name) <= threshold)
                System.out.println(name + " is low on stock.");
        }
    }

    public void displayInventory() {
        System.out.println("Inventory: " + products);
    }

    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct("Laptop", 5);
        inv.addProduct("Mouse", 2);
        inv.displayInventory();
        inv.checkLowInventory(3);
        inv.removeProduct("Mouse");
        inv.displayInventory();
    }
}


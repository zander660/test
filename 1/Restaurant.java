import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private Map<String, Double> menu = new HashMap<>();
    private Map<String, Integer> ratings = new HashMap<>();

    public void addItem(String item, double price) {
        menu.put(item, price);
    }

    public void removeItem(String item) {
        menu.remove(item);
    }

    public void addRating(String item, int rating) {
        ratings.put(item, rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        int total = 0;
        for (int r : ratings.values()) total += r;
        return (double) total / ratings.size();
    }

    public void displayMenu() {
        System.out.println("Menu: " + menu);
        System.out.println("Average Rating: " + getAverageRating());
    }

    public static void main(String[] args) {
        Restaurant res = new Restaurant();
        res.addItem("Pasta", 120.0);
        res.addItem("Burger", 90.0);
        res.addRating("Pasta", 5);
        res.addRating("Burger", 4);
        res.displayMenu();
        res.removeItem("Burger");
        res.displayMenu();
    }
}

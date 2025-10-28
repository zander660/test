public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public void displayStatus() {
        System.out.println("Color: " + color + ", Duration: " + duration + " seconds");
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        light.displayStatus();
        light.changeColor("Green");
        light.displayStatus();
    }
}

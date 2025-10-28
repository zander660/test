public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Max", "Beagle");

        dog1.setName("Charlie");
        dog1.setBreed("Golden Retriever");

        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        dog1.displayInfo();
        dog2.displayInfo();
    }
}


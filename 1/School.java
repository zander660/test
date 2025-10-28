import java.util.ArrayList;

public class School {
    private ArrayList<String> students = new ArrayList<>();
    private ArrayList<String> teachers = new ArrayList<>();
    private ArrayList<String> classes = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void addTeacher(String name) {
        teachers.add(name);
    }

    public void removeTeacher(String name) {
        teachers.remove(name);
    }

    public void createClass(String className) {
        classes.add(className);
    }

    public void displayInfo() {
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
    }

    public static void main(String[] args) {
        School school = new School();
        school.addStudent("Liam");
        school.addTeacher("Mrs. Cruz");
        school.createClass("Math 101");
        school.displayInfo();
        school.removeStudent("Liam");
        school.displayInfo();
    }
}

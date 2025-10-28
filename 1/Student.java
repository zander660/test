import java.util.ArrayList;

public class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }

    public static void main(String[] args) {
        Student s = new Student("Emma", "10th Grade");
        s.addCourse("Math");
        s.addCourse("Science");
        s.displayInfo();
        s.removeCourse("Math");
        s.displayInfo();
    }
}

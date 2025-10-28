import java.time.LocalDate;
import java.time.Period;

public class Employee1 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee1(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Years of Service: " + getYearsOfService());
    }

    public static void main(String[] args) {
        Employee1 emp = new Employee1("Robert", 50000, LocalDate.of(2015, 5, 20));
        emp.displayInfo();
    }
}

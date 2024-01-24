import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Hamza", "Şahin");
        Employee employee2 = new Employee(2, "Ahmet", "Özcan");
        Employee employee3 = new Employee(3, "Ayşe", "Kartal");
        Employee employee4 = new Employee(3, "Kemal", "Yurtseven");
        Employee employee5 = new Employee(4, "Ömer", "Şahin");
        Employee employee6 = new Employee(4, "Kaya", "Şahin");

        List<Employee> employees = new LinkedList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        System.out.println(employees);

    }
}
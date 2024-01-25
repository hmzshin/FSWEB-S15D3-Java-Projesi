import java.util.*;

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

        Set<Employee> uniqueEmployees = new HashSet<>(employees);
        Set<Employee> doubleEmployees = new LinkedHashSet<>();
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).equals(employees.get(j))) {
                    doubleEmployees.add(employees.get(i));
                }

            }
        }
        System.out.println("***************************** double employees***********");
        System.out.println(doubleEmployees);

        Map<Integer, Employee> newEmployeeMap = new HashMap<>();

        for (Employee employee : uniqueEmployees) {
            newEmployeeMap.put(employee.getId(), employee);

        }
        System.out.println("****************Map list*****************");
        System.out.println(newEmployeeMap);

        System.out.println("**************Remove repetitive items***********");
        List<Employee> newEmployeeList = new ArrayList<>();

        for (Employee person : employees) {
            if (!newEmployeeList.contains(person)) {
                newEmployeeList.add(person);
            }
        }

        System.out.println(newEmployeeList);


    }
}
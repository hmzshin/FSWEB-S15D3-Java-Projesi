import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = getEmployeeList();


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


        ArrayList<String> words = getStrings();
        System.out.println(words);
        Map<String, Integer> repetition = new LinkedHashMap<>();
        for (String word : words) {
            if (repetition.containsKey(word)) {
                int value = repetition.get(word);

                repetition.put(word, value + 1);

            } else {
                repetition.put(word, 1);
            }
        }

        for (String key : repetition.keySet()) {

            System.out.println("Key: " + key + "\n" + "Value: " + repetition.get(key));
        }


    }

    private static ArrayList<String> getStrings() {
        String text = "When the offensive resumed, the Turks received their first victory when the Greeks encountered stiff resistance in the battles of First and Second İnönü," + " due to İsmet Pasha's organization of an irregular militia into a regular army. " + " The two victories led to Allied proposals to amend the Treaty of Sèvres where both Ankara and Istanbul were represented, but Greece refused." + " With the conclusion of the Southern and Eastern fronts, Ankara was able to concentrate more forces on the West against the Greeks." + " They also began to receive support from Soviet Union, as well as France and Italy, who sought to check British influence in the Near East.\n" + " June–July 1921 saw heavy fighting in the Battle of Kütahya-Eskişehir. While it was an eventual Greek victory, the Turkish army withdrew in good order to the Sakarya river, their last line of defence." + " Mustafa Kemal Pasha replaced İsmet Pasha after the defeat as commander in chief as well as his political duties." + " The decision was made in the Greek military command to march on the nationalist capital of Ankara to force Mustafa Kemal to the negotiating table." + " For 21 days, the Turks and Greeks fought a pitched battle at the Sakarya river, which ended in Greek withdrawal." + " Almost of year of stalemate without much fighting followed, during which Greek moral and discipline faltered while Turkish strength increased." + " French and Italian forces evacuated from Anatolia. The Allies offered an armistice to the Turks, which Mustafa Kemal refused.";

        text = text.replaceAll("[.,?!']", "");
        return new ArrayList<>(Arrays.asList(text.split(" ")));
    }

    private static List<Employee> getEmployeeList() {
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
        return employees;
    }


}
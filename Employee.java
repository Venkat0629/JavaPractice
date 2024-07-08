import java.util.*;

public class Employee {
    private int id;
    private String name;
    private int age;


    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }

    public static Map<Employee, Double> loadData(String mapType) {

        Map<Employee, Double> map = getEmployeeMap(mapType);
        map.put(new Employee(105, "Venkat", 24), 65000.0);
        map.put(new Employee(103, "Harsha", 25), 55000.0);
        map.put(new Employee(102, "Ganesh", 24), 85000.0);
        map.put(new Employee(101, "Harish", 26), 90000.0);
        map.put(new Employee(104, "Tajumn", 24), 75000.0);
        map.put(new Employee(103, "Nitesh", 23), 70000.0);
        map.put(new Employee(104, "Naveen", 27), 80000.0);
        return map;
    }

    private static Map<Employee, Double> getEmployeeMap(String mapType) {
        Map<Employee, Double> map = Collections.emptyMap();
        if (Objects.equals(mapType, "TreeMap"))
            map = new TreeMap<>((o1, o2) -> {
                if (o1.id == o2.id)
                    return o1.age != o2.age ?
                            Integer.compare(o1.age, o2.age) : o1.name.compareTo(o2.name);
                return o1.id > o2.id ? 1 : -1;
            });
        else if (Objects.equals(mapType, "HashMap"))
            map = new HashMap<>();
        else if (Objects.equals(mapType, "LinkedHashMap"))
            map = new LinkedHashMap<>();

        return map;
    }
}
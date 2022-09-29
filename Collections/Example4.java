import java.util.HashMap;
import java.util.Objects;

//4) Create class Employee with attributes name,age,designation and use instances of these class
// as keys in a Map and their salary as value
class Employee4{
    String name;
    String designation;
    Integer age;


    public Employee4(String name, String designation, Integer age) {
        this.name = name;
        this.designation = designation;
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee4 employee4 = (Employee4) o;
        return Objects.equals(name, employee4.name) && Objects.equals(designation, employee4.designation) && Objects.equals(age, employee4.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, designation, age);
    }

    @Override
    public String toString() {
        return "Employee4{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Example4 {
    public static void main(String[] args) {
        Employee4 ep1 = new Employee4("Raj","Software Engineer",21);
        Employee4 ep2 = new Employee4("Ayush", "Python Developer",22);
        Employee4 ep3 = new Employee4("Ayush", "Python Developer",22);

        HashMap<Employee4,Integer> epMap1 = new HashMap<>();
        epMap1.put(ep1,8000);

        epMap1.put(ep2,10000);
        epMap1.put(ep3,5000);
        HashMap<Employee4,Integer> epMap2 = new HashMap<>();
        epMap2.put(ep1,8000);
        epMap2.put(ep2,10000);
        epMap2.put(ep3,5000);
        System.out.println(epMap1);
        System.out.println(ep2.equals(ep1));

    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//2) Given the following class
//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname.

public class Example2 {
    public static void main(String[] args) {
        List<Employee> listEmployees = new ArrayList<>();
        Employee e1 = new Employee("Raj","Bhuva",10000.0);
        Employee e2 = new Employee("Ayush","Jain",5000.0);
        Employee e3 = new Employee("Aman","Patel",4000.0);
        Employee e4 = new Employee("Sagar","Gupta",6000.0);
        Employee e5 = new Employee("Rahul","Sharma",1000.0);
        listEmployees.add(e1);
        listEmployees.add(e2);
        listEmployees.add(e3);
        listEmployees.add(e4);
        listEmployees.add(e5);
        System.out.println("Before sorting: " + listEmployees);
        Collections.sort(listEmployees);
        System.out.println("After sorting: " + listEmployees);
        System.out.println();
//        for sorting based on salary
        System.out.println("Before sorting (Based on Salary): " + listEmployees);
        Collections.sort(listEmployees, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2) {
                        return e1.Salary.compareTo(e2.Salary);
                    }
                }
        );
        System.out.println("After sorting (Based on Salary): " + listEmployees);
    }
}

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList()));

        Employee ep1 = new Employee("Raj Bhuva",10000,"Gujarat");
        Employee ep2 = new Employee("Ayush Jain",4000,"Delhi");
        Employee ep3 = new Employee("Tarun Sharma",10000,"Goa");
        Employee ep4 = new Employee("Rahul Gupta",3000,"Delhi");
        Employee ep5 = new Employee("Raj Bhuva",10000,"Himalaya");

        System.out.println(Arrays.asList(ep1,ep2,ep3,ep4,ep5).stream()
                .filter(e->e.salary < 5000 & e.city =="Delhi")
                .map(e ->e.fullName.split(" ")[0]).collect(Collectors.toSet()).toString());

    }
}

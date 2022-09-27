import java.security.cert.CertPathValidatorException;
import java.util.Scanner;
import java.util.*;
class circle{
    public static double areaOfCircle(double radius){
        double area = Math.PI*radius*radius;
        return area;
    }
    public static double CircumferenccesOfCircle(double radius){
        double Circumferences = 2*Math.PI*radius;
        return Circumferences;
    }
}
public class Example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Calculate Area of Circle\n2. Calculate Circumference of a Circle\n3. Exit\n");
        System.out.print("Choose an option (1-3): ");
        int user_input = input.nextInt();
        Double radius = null;

        if ((user_input == 1) || (user_input ==2)){
            System.out.print("Enter radius od circle: ");
            radius = input.nextDouble();
        }
        switch (user_input) {
            case 1:
                System.out.println("Area of Circle = "+ circle.areaOfCircle(radius));
                break;
            case 2:
                System.out.println("Circumference of a Circle = "+ circle.CircumferenccesOfCircle(radius));
                break;
            case 3:break;
            default:
                System.out.println("Enter valid input!!!");
                break;

        }
    }
}
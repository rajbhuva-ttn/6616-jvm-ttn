public class Example1 {
    static String firstName;
    static String lastName;
    static int age;

    public static void displayName() {
        System.out.println("Print Inside static method");
        firstName = "Raj";
        lastName = "Bhuva";
        age = 21;
        System.out.println("My name is : " + firstName + " " + lastName + " and I am " + age + " years old.");
    }

    static {
        System.out.println("Print Inside static block");
        firstName = "Raj";
        lastName = "Bhuva";
        age = 21;
        System.out.println("My name is : " + firstName + " " + lastName + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Example1.displayName();

        System.out.println("Print using static variables");
        System.out.println("My name is : " + firstName + " " + lastName + " and I am " + age + " years old.");
    }
}
class Employee
{
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    Employee(){
        System.out.println("Non-parameterized Constructor");
    }
    Employee(String firstName,String lastName,int age,String designation){
        this.firstName =firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return this.firstName+" "+this.lastName+" is "+this.age+" years old working as a "+this.designation;

    }
}
public class Example5 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raj","Bhuva",21,"Software Engineer");
        System.out.println(e1);

    }
}

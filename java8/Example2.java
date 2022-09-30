//Q2) Using (instance) Method reference create and apply add and
// subtract method and using (Static) Method reference create and apply
// multiplication method for the functional interface created
interface MyInterface{
    void display(int a,int b);
}
public class Example2 {


    public static void main(String[] args) {

        MyInterface myInterface = new InterfaceExample2()::staticAddition;
        myInterface.display(1,1);

        MyInterface myInterface2 = new InterfaceExample2()::staticSubtract;
        myInterface2.display(3,2);

        myInterface =  InterfaceExample2::instanceMultiply;
        myInterface.display(6,2);
    }
}

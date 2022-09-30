import java.util.Comparator;
import java.util.Locale;

@FunctionalInterface
interface GreaterThan{
    boolean checkGreater(int a,int b);
}
@FunctionalInterface
interface Increment{
    int checkIncrement(int a);
}
@FunctionalInterface
interface Concatination{
    String checkConcat(String a,String b);
}
@FunctionalInterface
interface ConvertString{
    String toUppercase(String a);
}
public class Example1{
    public static void main(String[] args) {
        GreaterThan greaterThan = (a, b) -> a > b;
        System.out.println(greaterThan.checkGreater(9, 1));


        Increment increment = a -> a++;
        System.out.println(increment.checkIncrement(9));

        Concatination concatination = (a,b)-> a.concat(b);
        System.out.println(concatination.checkConcat("Hello","Raj"));

        ConvertString convertString = a -> a.toUpperCase();
        System.out.println(convertString.toUppercase("Work Hard"));
    }
}



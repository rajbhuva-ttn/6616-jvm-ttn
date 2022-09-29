import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {

        ArrayList<Float> l1 = new ArrayList<>();
        l1.add(25.1f);
        l1.add(15.11f);
        l1.add(44.75f);
        l1.add(16.33f);
        l1.add(78.12f);
        Iterator<Float> it = l1.iterator();
        Float sum = 0.0f;
        while(it.hasNext()){
            Float element = it.next();
            sum +=element;
        }
        System.out.println(sum);

    }
}

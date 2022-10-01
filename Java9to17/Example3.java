package Java9to17;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Use rangeClosed to create a Stream
public class Example3 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(0,50)
                .boxed()
                .collect(Collectors.toList()));
    }
}

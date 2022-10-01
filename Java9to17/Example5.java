package Java9to17;

import java.util.Optional;
import java.util.stream.IntStream;

public class Example5 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10)
                .filter(e->e>20)
                .findFirst()
                .ifPresentOrElse(System.out::println,()-> System.out.println("Invalid input"));

        IntStream.rangeClosed(1,10)
                .filter(e->e>20)
                .boxed()
                .findFirst()
                .or(()-> Optional.of(-1))
                .ifPresentOrElse(System.out::println,()-> System.out.println("Invalid input"));

        IntStream.rangeClosed(1,10)
                .filter(e->e>20)
                .findFirst()
                .orElseThrow();
    }
}

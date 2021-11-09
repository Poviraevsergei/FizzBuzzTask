import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {

    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;

    public String solution() {
        return IntStream.rangeClosed(START_RANGE, END_RANGE)
                .mapToObj(i -> i % 5 == 0 ? (i % 3 == 0 ? "FizzBuzz" : "Buzz") : (i % 3 == 0 ? "Fizz" : String.valueOf(i)))
                .collect(Collectors.joining(" "));
    }
}
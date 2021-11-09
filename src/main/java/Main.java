import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> rules = new HashMap<>();
        rules.put(3, "Fizz");
        rules.put(5, "Buzz");
        rules.put(7, "Jazz");

        FizzBuzzTask fizzBuzzTask = new FizzBuzzTask();

        //Common solution
        System.out.println(fizzBuzzTask.solution());

        //Solution with rules
        System.out.println(fizzBuzzTask.solutionWithRule(rules));
    }
}
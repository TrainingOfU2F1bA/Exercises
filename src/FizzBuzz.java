import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.start(100);
        fizzBuzz.results.forEach(x-> System.out.println(x));

    }
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        results = IntStream.rangeClosed(1, count).boxed().map(Object::toString).
                map(map2FizzBuzzWhizz(15, "FizzBuzz")).
                map(map2FizzBuzzWhizz(3, "Fizz")).
                map(map2FizzBuzzWhizz(5, "Buzz")).
                collect(Collectors.toList());
    }

    private Function<String, String> map2FizzBuzzWhizz(int i, String fizzBuzzWhizz) {
        return x -> canBeDivided(x, i) ? fizzBuzzWhizz : x;
    }

    private boolean canBeDivided(String integer, int i) {
        if (isMatches(integer))  return Integer.parseInt(integer) % i == 0;
        return false;
    }

    private boolean isMatches(String x) {
        return Pattern.compile("[1-9][0-9]*").matcher(x).matches();
    }

    public List<String> getResults() {
        return results;
    }
}


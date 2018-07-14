import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeFactors {
    public static void main(String[] args) {
        generate(new Scanner(System.in).nextInt());
    }

    private static void generate(int n) {
        List<Integer> list = getPrimeFactorsList(n).collect(Collectors.toList());
        if (list.size()>0) list.forEach(System.out::println);
        else System.out.println(n);
    }

    private static Stream<Integer> getPrimeFactorsList(int n) {
        List<Integer> integers = new LinkedList<Integer>(Arrays.asList(2, 3));
        return primeList(integers,n/2, 3).stream().filter(x->n%x==0);
    }

    private static List<Integer> primeList(List<Integer> integers, int sqrt, int i) {
        if (sqrt < i) return integers;
        if (integers.stream().noneMatch(x -> i % x == 0)) integers.add(i);
        return primeList(integers, sqrt, i + 1);
    }
}

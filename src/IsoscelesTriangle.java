import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IsoscelesTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLine = scanner.nextInt();
        IntStream.range(1,numOfLine+1).map(x->x*2-1).forEach(printLine(numOfLine));

    }

    private static IntConsumer printLine(int numOfLine) {
        return x1 -> {
            int span = ((numOfLine) * 2 - 1 - x1) / 2;
            IntStream.rangeClosed(0, span + x1).forEach(i -> {
                if (i < span) System.out.print(" ");
                if (i > span) System.out.print("*");
            });
            System.out.println();
        };
    }

}

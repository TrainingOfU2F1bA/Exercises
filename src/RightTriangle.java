import java.util.Scanner;
import java.util.stream.IntStream;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLine = scanner.nextInt();
        IntStream.range(1,numOfLine+1).forEach(RightTriangle::printLine);

    }

    private static void printLine(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

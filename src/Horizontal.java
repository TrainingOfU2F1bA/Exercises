import java.util.Scanner;

public class Horizontal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfAsterisk = scanner.nextInt();
        for (int i = 0; i < numOfAsterisk; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

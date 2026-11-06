
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (at least 2): ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("Invalid input. Enter a number at least 2.");
        } else {

            System.out.println("Prime numbers:");

            for (int i = 2; i <= n; i++) {

                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }

        input.close();
    }
}


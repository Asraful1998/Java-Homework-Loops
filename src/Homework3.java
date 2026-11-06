
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 12: ");
        int n = input.nextInt();

        long factorial = 1;

        if (n < 0 || n > 12) {
            System.out.println("Invalid input. Enter a number between 0 and 12.");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            System.out.println(n + "! = " + factorial);
        }

        input.close();
    }
}


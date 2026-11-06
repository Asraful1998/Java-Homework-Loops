
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= width; j++) {

                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        input.close();
    }
}


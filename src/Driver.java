import java.util.Scanner;

/**
 * Created by ryanbrooks on 11/10/14.
 */
public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        System.out.println("Math 2605 final project");
        System.out.println("Authors: Ryan Brooks, Domenic Valles, *********");

        while (!done) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Gauss-Newton Method for finding best curve");
            System.out.println("2. Power Method to find Eigenvalues of 2x2 Matrix");
            System.out.println("3. View an Animation in 2 Dimensions");
            System.out.println("4. Exit");
            int selection = scanner.nextInt();
            if (selection == 1) {
                //Gauss Newton
                System.out.println("Gauss Newton Method");
            } else if (selection == 2) {
                //Power Method
                System.out.println("Power Method");
            } else if (selection == 3) {
                //Animation
                System.out.println("Animation");
            } else if (selection == 4) {
                //Exit
                System.out.println("Quitting...");
                done = true;
            }
        }
    }
}

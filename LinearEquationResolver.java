package LinearEquationResolver;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a question as 'a * x + b = 0', please enter constants:");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("a: ");
        double a = keyboard.nextDouble();
        System.out.println("b: ");
        double b = keyboard.nextDouble();

        if (a != 0) {
            double x = - b / a;
            System.out.printf("The solution is: %f!", x);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}

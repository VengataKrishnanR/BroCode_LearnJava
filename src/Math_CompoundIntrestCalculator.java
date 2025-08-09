import java.util.Scanner;

public class Math_CompoundIntrestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principle amount: ");
        int P = scanner.nextInt();

        System.out.println("Enter the Annual Intrest Rate: ");
        int i = scanner.nextInt();

        System.out.println("Enter the Number of Times Interest is Compounded ");
        double r = scanner.nextDouble();

        System.out.println("Enter the Number of Years: ");
        int n = scanner.nextInt();

        double a;
        a = Math.pow((1 + r/100),n);

        double b;
        b = (P*a)-P;

        System.out.println(b);

    }
}

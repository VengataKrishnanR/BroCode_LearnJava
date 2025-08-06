import java.util.Scanner;

public class Math_HypotenusCalculation {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;

        System.out.println("Enter the A side: ");
        a = scanner.nextDouble();

        System.out.println("Enter the B Side: ");
        b = scanner.nextDouble();

        double c;

        c = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));

        System.out.println("The value is "+c);
        scanner.close();

    }
}

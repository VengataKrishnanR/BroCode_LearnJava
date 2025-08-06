import java.util.Scanner;

public class Math_CircleCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r;
        System.out.print("Enter the Circle Radius: ");
        r = scanner.nextDouble();

        double cir;
        cir = Math.round( 2 * Math.PI * r);

        double area;
        area = Math.round(Math.PI * Math.pow(r,2));

        double volumn;
        volumn = Math.round((4.0/3.0)*Math.PI * Math.pow(r,2));

        System.out.println( "The Circumference of given Radius is "+ cir);
        System.out.println( "The Area of given Radius is "+ area);
        System.out.println( "The Volumn of given Radius is "+ volumn);
    }
}

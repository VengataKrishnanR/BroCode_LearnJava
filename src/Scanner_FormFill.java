import java.util.Scanner;

class Formfill{
    public static void main (String arg[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your School name: ");
        String Sname = scanner.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Hi! "+name+ " your age is "+age+" and your have graduated from "+ Sname+" with "+gpa+"!");

        scanner.close();
    }
}
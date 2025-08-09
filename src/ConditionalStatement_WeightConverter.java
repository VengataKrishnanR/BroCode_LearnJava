import java.util.Scanner;

public class ConditionalStatement_WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Converter");

        double weight;
        double newWeight;
        int choice;

        System.out.println("1. Convert Kgs to Lbs");
        System.out.println("2. Convert lbs to Kgs");

        choice = scanner.nextInt();

        if(choice==1) {
            System.out.println("Enter the Weight in Kilogram: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45;
            System.out.println("The Weight in Pound is "+newWeight);
        } else if (choice==2) {
            System.out.println("Enter the Weight in Pounds: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.204;
            System.out.println("The Weight in Kilogram is "+newWeight);
        }
        else{
            System.out.println("Enter a Valid Option");
        }

        scanner.close();
    }
}

// This code is a practice code in terms of Conditional statement called Odd or Even

//if you run this code you need to feed the number that you need to find the given number is odd or even based on the value the code will return your the result
import java.util.Scanner;

public class ConditionalStatement_Odd_or_Even {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number to find the Number is odd or Even");

        int num = scanner.nextInt();

        if((num%2)==0){
            System.out.println("The Number Entered " + num + " is an Even Number" );
        }
        else {
            System.out.println("The Number Entered " + num + " is a Odd Number");
        }

        scanner.close();
    }
}

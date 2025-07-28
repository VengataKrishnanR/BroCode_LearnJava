import java.sql.SQLOutput;
import java.util.*;

public class ShoppingCart {
    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Product you want to Buy: (Pizza and Burger): ");
        String product = scanner.nextLine();

        System.out.println("Enter the Quantity: ");
        int quantity = scanner.nextInt();

        int Pizza = 5;
        int Burger = 4;
        int cartvalue;

        if(Pizza == quantity){
             cartvalue = Pizza * quantity;
        }
        else{
             cartvalue = Burger * quantity;
        }

        System.out.println("The total Bill amount is $"+cartvalue);

    }
}

import java.util.Scanner;

public class StringMethod_SubStringPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Email Address: ");
        String   email = scanner.next();

        String username = email.substring(0,email.indexOf("@"));
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".", atIndex);  // Start searching from after '@'

        String domain = email.substring(atIndex + 1, dotIndex);

        System.out.println("The UserName is "+ username);
        System.out.println("The Domain is "+ domain);

        scanner.close();
    }
}

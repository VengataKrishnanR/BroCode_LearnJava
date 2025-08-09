import java.util.Scanner;

public class StringMethods_Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Name/String: ");
        String name = scanner.nextLine();

        // Length of the string
        int stringLength = name.length();
        System.out.println("Length of the string: " + stringLength);

        // Character at a given index
        System.out.println("Enter an index number to get the character at that position: ");
        int indexNumb = scanner.nextInt();
        if (indexNumb >= 0 && indexNumb < name.length()) {
            char characterAtIndex = name.charAt(indexNumb);
            System.out.println("Character at index " + indexNumb + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index.");
        }

        // Consume the leftover newline
        scanner.nextLine();

        // Find first index of a character
        System.out.println("Enter a character to find its first occurrence index: ");
        String firstChar = scanner.nextLine();
        int indexFirst = name.indexOf(firstChar);
        System.out.println("First occurrence index of '" + firstChar + "': " + indexFirst);

        // Find last index of a character
        System.out.println("Enter a character to find its last occurrence index: ");
        String lastChar = scanner.nextLine();
        int indexLast = name.lastIndexOf(lastChar);
        System.out.println("Last occurrence index of '" + lastChar + "': " + indexLast);

        // Convert to upper case
        System.out.println("Upper case: " + name.toUpperCase());

        // Convert to lower case
        System.out.println("Lower case: " + name.toLowerCase());

        // Trim the white spaces
        System.out.println("Trimmed string: '" + name.trim() + "'");

        // Replace characters
        System.out.println("Enter a character or word to replace: ");
        String oldChar = scanner.nextLine();
        System.out.println("Enter new character or word to replace with: ");
        String newChar = scanner.nextLine();
        String replacedString = name.replace(oldChar, newChar);
        System.out.println("After replacement: " + replacedString);

        scanner.close();
    }
}

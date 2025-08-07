import java.util.Scanner;
class PrintF_Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("Enter your Name: ");
        name = scanner.nextLine();

        int age;
        System.out.println("Enter your Age: ");
        age = scanner.nextInt();

        boolean isEmployed;
        System.out.println("Are you employed: ");
        isEmployed = scanner.nextBoolean();
        scanner.nextLine();

        if(isEmployed) {

            String company;
            System.out.println("Enter your Current Organisation: ");
            company = scanner.nextLine();

            double salary;
            System.out.println("Enter your salary: ");
            salary = scanner.nextDouble();

            System.out.printf("Hi %s and your age is %d and working in %s with %.2f",name, age,company,salary);
        }
        else{
            System.out.printf("Hi %s and your age is %d and your are currently unemployed",name, age);
        }



    }
}

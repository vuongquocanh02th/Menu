import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the Triangle");
            System.out.println("2. Draw the Square");
            System.out.println("3. Draw the Rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the Triangle");
                    System.out.println("* * * * *");
                    System.out.println("* * * * ");
                    System.out.println("* * * ");
                    System.out.println("* * ");
                    System.out.println("* ");
                    break;
                case 2:
                    System.out.println("Draw the Square");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("Draw the Rectangle");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}

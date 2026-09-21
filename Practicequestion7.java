import java.util.*;

public class Practicequestion7 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // q2
        int n;
        int choice;
        int Evensum = 0;
        int Oddsum = 0;

        do {

            System.out.println("Enter the number :");
            n = sc.nextInt();

            if (n % 2 == 0) {
                Evensum = Evensum + n;
            } else {
                Oddsum = Oddsum + n;
            }

            System.out.println("If you want to continue press 1 for yes and 0 for no :");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even numbers are " + Evensum);
        System.out.println("Sum of odd numbers are " + Oddsum);

        // q3
        int num;
        int fact = 1;

        System.out.println("Enter any positive integer : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial is " + fact);

        // q4
        System.out.println("Enter number for table:");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        sc.close();
    }
}
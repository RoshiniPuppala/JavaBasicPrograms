import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
        sc.close();
    }
}

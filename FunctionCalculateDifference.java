import java.util.Scanner;

public class FunctionCalculateDifference {

    public static int calculateDifference(int a, int b) {
        int difference = a - b;
        return difference;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        int difference = calculateDifference(a , b);
        System.out.println("The difference is "+difference);

    }
}

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("The numbers are "+num1+" and "+num2);

        int tmp;
        tmp = num1;
        num1 = num2;
        num2 = tmp;

        System.out.println("The swapped numbers are "+num1+ " and "+num2);

    }
}

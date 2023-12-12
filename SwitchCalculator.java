import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number");
        float num2 = sc.nextFloat();
        System.out.println("Enter the operation symbol");
        char option = sc.next().charAt(0);

        switch (option) {
            case '+':
                float AddResult = num1 + num2;
                System.out.println(AddResult);
                break;

            case '-':
                float MinusResult = num1 - num2;
                System.out.println(MinusResult);
                break;

            case '*':
                float MultiplyResult = num1 * num2;
                System.out.println(MultiplyResult);
                break;
            case '/':
                float DevideResult = num1 / num2;
                System.out.println(DevideResult);
                break;

            case '%':
                float ModuloResult = num1 % num2;
                System.out.println(ModuloResult);
                break;
        }
    }
}

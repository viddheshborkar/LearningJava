import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number");
        float num2= sc.nextFloat();
        float result =num1/num2;
        System.out.println("The answer is: "+result);
    }
}

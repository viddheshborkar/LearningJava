import java.util.Scanner;

public class EqualGreaterLesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Both "+num1+" and "+num2+" are equal");
        } else if (num1 > num2) {
            System.out.println(num1+" is greater than "+num2);
        }else {
            System.out.println(num1+" is lesser than "+num2);
        }
    }
}

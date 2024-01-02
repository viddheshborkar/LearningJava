import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, reverse = "";
        System.out.println("Enter a string to be reversed");
        String string = sc.nextLine();
        System.out.println("The entered string is "+string);

        System.out.println("The reverse of string is ");

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        System.out.println(reverse);
    }
}
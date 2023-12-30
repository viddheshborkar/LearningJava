import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String FirstName = sc.next();
        System.out.println("Enter last name");
        String LastName = sc.next();
        System.out.println("Hi\n"+FirstName+" "+LastName+"!");
    }
}

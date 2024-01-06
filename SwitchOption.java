import java.util.Scanner;

public class SwitchOption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an option to greet");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("HelloName");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}

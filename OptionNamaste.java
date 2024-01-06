import java.util.Scanner;

public class OptionNamaste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            System.out.println("HelloName");
        } else if (option == 2) {
            System.out.println("Namaste");
        } else if (option == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Option");
        }
    }
}

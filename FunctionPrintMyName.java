import java.util.Scanner;

public class FunctionPrintMyName {

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();

        printMyName("The name is "+name);
    }
}

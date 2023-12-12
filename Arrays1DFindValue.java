import java.util.Scanner;

public class Arrays1DFindValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter elements in an array");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched in an array");
        int x = sc.nextInt();

        System.out.println(x+" found at index: ");
        for (int i=0; i<numbers.length; i++) {
            if (numbers [i] == x ) {
                System.out.println(i);
            }

        }
    }

}
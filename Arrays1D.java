import java.util.Scanner;

public class Arrays1D {

    public static void main(String args[]) {
//        int [] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;

//        int marks[] = {10, 12, 15};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int numbers [] = new int [size];
        System.out.println("Enter array elements ");

        for (int i = 0; i< size; i++) {

            numbers[i] = sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int i =0; i< size; i++) {
            System.out.println(numbers[i]);
        }
    }
}

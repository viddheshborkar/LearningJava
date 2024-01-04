import java.util.Scanner;

public class Arrays2DFindValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of matrix");
        int rows = sc.nextInt();
        System.out.println("Enter columns of matrix");
        int cols = sc.nextInt();
        System.out.println("Enter values of matrix");
        int numbers[][] = new int[rows][cols];

        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number to be searched");
        int x = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println(x+" found at location "+i + "," + j);
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false){
            System.out.println("Element not found");
        }
    }
}
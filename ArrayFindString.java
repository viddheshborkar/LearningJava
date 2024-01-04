import java.util.Scanner;

public class ArrayFindString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String arr[] = {"Tiger", "Lion", "Fox", "Dog", "Cat","Deer","Horse"};
        System.out.println("Enter animal to be found");
        String value = sc.next();

        boolean flag = false;
        for (int i=0; i<=arr.length-1;i++) {
            if (arr[i].equals(value)) {
                System.out.println(value+" found at location "+(i));
                flag = true;
                break;
                }
            }
        if (flag == false){
            System.out.println("Element Not Found");
        }
        }
    }

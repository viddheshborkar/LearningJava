import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String firstName = "Viddhesh";
        String lastName = "Borkar";

        String fullName = firstName +"$"+ lastName;
        System.out.println("The full name is :"+fullName);

        for(int i=0; i< fullName.length();i++) {
            System.out.println(fullName.charAt(i));
        }

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the address :");
//        String address = sc.nextLine();
//        System.out.println("The entered address is :"+address);
//        System.out.println("The length of address is :"+address.length());

        String name1 = "Viddhesh";
                String name2 = "Viddhesh";

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        String sentence = "My name is Tony";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
    }
}


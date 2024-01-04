public class ArrayFindString {

    public static void main(String[] args) {

        String arr[] = {"Tiger", "Lion", "Fox", "Dog", "Cat","Deer","Horse"};
        String value = "Deer";
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

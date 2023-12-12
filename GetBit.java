public class GetBit {

    //

    public static void main(String[] args) {
        int number = 5;
        int position = 2;
        int bitMask = 1 << position;

        if((bitMask & number)==0) {
            System.out.println("bit was zero");

        } else {
            System.out.println("bit was one");
        }
    }
}

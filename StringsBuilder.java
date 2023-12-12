public class StringsBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder ("Viddhesh");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'S');
        System.out.println(sb);

        System.out.println(sb.length());

        sb.insert(8, 'h');
        System.out.println(sb);

        sb.delete(3,9);
        System.out.println(sb);

    }
}

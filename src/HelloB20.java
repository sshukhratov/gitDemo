public class HelloB20 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // added a line

        String name = "rodraS";
        String reverse = "";
        for (int i = name.length()-1; 0 <= i; i--){
            char each = name.charAt(i);
            reverse += each;
        }

        System.out.println(reverse);


    }
}

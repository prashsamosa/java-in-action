public class datatypes {

    public static void main(String[] args) {
        int a = 5;
        double b = 5.99;
        char c = 'A';
        String d = "Hello";

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("String: " + d);

        char charValue = 'a';
        int value = charValue; // Implicit conversion from char to int
        System.out.println("Character to Integer: " + value);


        char charValue2 = 'b';
        int value2 = (int) charValue2; // Explicit conversion from char to int
        System.out.println("Character to Integer (explicit): " + value2);

        System.out.println(Integer.toBinaryString(value2));
    }

}

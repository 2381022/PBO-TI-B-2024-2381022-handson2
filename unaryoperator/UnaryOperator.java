package unaryoperator;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = -5;
        boolean isTrue = true;

        // Increment
        System.out.println("x awal: " + x);
        System.out.println("++x: " + ++x); // Pre - Increment
        System.out.println("x++: " + x++); // Post - Increment
        System.out.println("x akhir: " + x);

        // Decrement
        System.out.println("x awal: " + x);
        System.out.println("++x: " + --x); // Pre - Decrement
        System.out.println("x++: " + x--); // Posst - Decrement
        System.out.println("x akhir: " + x);

        // Unary plus dan minus

        System.out.println("+x : "+ x);
        System.out.println("-y : "+ -y);

        // Logical Not
        System.out.println("!isTrue :" + !isTrue);
    }
}

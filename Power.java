import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner baseInput = new Scanner(System.in);
        System.out.println("enter the base number:" );
        int base = baseInput.nextInt();

        Scanner exponentInput = new Scanner(System.in);
        System.out.println("enter the exponent number:" );
        int exponent = exponentInput.nextInt();

        double result = Math.pow(base, exponent);

        System.out.println("the result of " + base + " to power of " + exponent + " is " + result );
    }
}

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int number = uInput.nextInt();
        int result = 1;

        for (int i = number; i >= 1 ; i--){

            result = result * i;

        }
        System.out.println("the Factorial of " + number + " is " + result);
    }
}

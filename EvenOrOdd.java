import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int number = uInput.nextInt();

        if ( number % 2 == 0 ){
            System.out.println("the entered number is even!!");
        }
        else {
            System.out.println("The entered number is odd!!");
        }
    }
}

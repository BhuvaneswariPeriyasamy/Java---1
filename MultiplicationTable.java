import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);

        System.out.println("Enter the number to see multiplication table: ");

        int number = uInput.nextInt();

        for (int i=1 ; i<=10 ; i++){

            int result = i * number;
            System.out.println( "\n" + i + " * " + number + " = " + result );
        }
    }
}

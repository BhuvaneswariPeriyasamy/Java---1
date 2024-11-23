
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);

        System.out.println("Enter the nth number : ");

        int number = uInput.nextInt();

//        for (int i = number; i >= 1 ; i--){
//
//            System.out.println("the reverse order upto n is " + " " + i);
//        }

        while (number >= 1){
            System.out.println("the reverse order upto n is " + " " + number);
            number --;
        }



    }
}

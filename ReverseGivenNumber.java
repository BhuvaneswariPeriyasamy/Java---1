import java.util.Scanner;

public class ReverseGivenNumber {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = uInput.nextInt();
        int reverseNumber = 0;
        String result = "";
        String reverse = String.valueOf(number);

        for (int i = ( reverse.length() - 1 ); i >=0; i--){

            result += reverse.charAt(i);

        }
        reverseNumber = Integer.valueOf(result);

        System.out.println("The reverse number is " + reverseNumber);

    }
}

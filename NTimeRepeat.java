import java.util.Scanner;

public class NTimeRepeat {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = uInput.nextInt();
        String output = "";
        for (int i =1; i <= number; i++){

            output += "*";
        }
        System.out.println(output);
    }
}

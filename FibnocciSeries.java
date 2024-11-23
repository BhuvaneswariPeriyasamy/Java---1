import java.util.Scanner;

public class FibnocciSeries {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = uInput.nextInt();

        int initialPlace = 0;
        int previousPlace = 1;

        if (number == 1){

            System.out.println("Fibonacci series: 0");
        }
        else if (number ==2 ){

            System.out.println("Fibonacci series: 0 , 1");
        }

        else {

            System.out.print("Fibonacci series: 0, 1");

            for (int i = 3; i <= number; i++) {

                int currentPlace = initialPlace + previousPlace;

                System.out.print("," + currentPlace);

                initialPlace = previousPlace;
                previousPlace = currentPlace;

            }

        }

    }
}

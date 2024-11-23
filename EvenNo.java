import java.util.Scanner;

public class EvenNo {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);

        System.out.println("Enter the number:" );

        int number = uInput.nextInt();

//        int i = 1;
//
//        while (i <= number){
//
//            if (i%2 == 0 ){
//
//                System.out.println("the even number upto " + number + " is " + i);
//            }
//            i++;
//
//        }

        for (int i=1; i<=number; i++){
            if (i%2 == 0 ){

                System.out.println("the even number upto " + number + " is " + i);
           }
        }

    }
}

import java.util.Scanner;

public class StringCounter {
    public static void main(String[] args) {

      String input = "helloee";

        char compare = 'e';

        int counter = 0;

        for (int currentStr = 0; currentStr < input.length() ; currentStr++ ){

            if ( input.charAt(currentStr) == compare){
                counter = counter + 1;

            }
        }
        System.out.println(counter);
    }
}

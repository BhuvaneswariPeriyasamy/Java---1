public class Array_Small {
    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};

        int small = input[0];

        for (int i=1; i < input.length; i++){

              if ( input[i] < small){

                  small = input[i];

          }

        }
        System.out.print("Small number is " + small);
    }
}

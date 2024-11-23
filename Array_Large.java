public class Array_Large {
    public static void main(String[] args) {

        int[] input = {1,2,3,9,5};

        int large = input[0];

        for (int i = 1; i < input.length; i++){

            if (large < input[i]){

                large = input[i];
            }
        }
        System.out.println("Large number is "+ large);
    }
}

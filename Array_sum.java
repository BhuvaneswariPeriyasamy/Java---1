public class Array_sum {
    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};
        int output =0;
        for (int i=0; i < input.length; i++ ){


            output += input[i];

        }
        System.out.println("Sum of array is " + output);
    }
}

public class Array_Search {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};

        int search = 2;

        for (int i=0; i< input.length; i++){

                if (input[i] == 5){

                    int output = i;
                    System.out.println("search element in array present in " + output + " th index");
                }
        }
    }
}

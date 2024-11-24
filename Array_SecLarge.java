public class Array_SecLarge {
    public static void main(String[] args) {

        int[] input = {19, 23, 35, 50, 28};

        int first = input[0];
        int sec = input[1];
        int big;
        int secbig;


        if (first < sec) {
            big = sec;
            secbig = first;
        } else {
            big = first;
            secbig = sec;
        }


        for (int pointer = 2; pointer < input.length; pointer++) {
            if (input[pointer] > big) {
                secbig = big;
                big = input[pointer];
            } else if (input[pointer] > secbig && input[pointer] != big) {
                secbig = input[pointer];
            }
        }

        System.out.println("Second Largest number is: " + secbig);
    }
}

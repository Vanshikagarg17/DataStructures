package Arrays;

public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] arr = {1,2,3,-2,5};
        int n =arr.length;
        /**
         * method 1
         */
        int max_so_far = Integer.MIN_VALUE, max_ending_value = 0;

        for (int i=0; i<n; i++){
            max_ending_value += arr[i];

            if (max_so_far < max_ending_value){
                max_so_far = max_ending_value;
            }

            if (max_ending_value < 0){
                max_ending_value = 0;
            }
        }
        System.out.println(max_so_far);

    }

}

package arrays;

import java.util.Scanner;

public class KadaneAlgo {

    public static void main(String[] args) {
//        take user input
        Scanner sc = new Scanner(System.in);
//        input the array length
        int n = sc.nextInt();
//        initialize the array
        int[] a = new int[n];

        for (int i=0; i<n; i++){
//            read the array
            a[i] = sc.nextInt();
        }
        int s =0;
        int start = 0; 
        int end = 0;
        /**
         * method 1
         *
         */
        int max_sum_so_far = Integer.MIN_VALUE, max_ending_value = 0;

        for (int i=0; i<n; i++){
            max_ending_value += a[i];

            if (max_sum_so_far < max_ending_value){
                max_sum_so_far = max_ending_value;
                start = s +1; // it give staring index
                end = i+1; // it give ending index
            }
            if (max_ending_value < 0){
                max_ending_value = 0;
                s = i+1;
            }
        }
        System.out.println(max_sum_so_far);
        System.out.print("Max sub array indices are " + start + " and " + end);



    }

}

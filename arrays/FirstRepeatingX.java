package Arrays;

public class FirstRepeatingX {

    public static void main(String[] args) {

        int[] arr = {4, 67, 13, 12, 15};
        int n = arr.length;
        int x = 16; // x is sum

        int temp = -1;

        /**
         * for edge case if a[0] == sum then it return -1;
         * for ex arr = {1,2,3,4,5} and sum = 1;
         * in this case we have to return -1
          */

        for (int i=0; i<n; i++){
            if (arr[i]< x){
                temp = arr[i];
            }else {
//                System.out.println(temp);
            }
        }
        System.out.println(temp);

    }

}

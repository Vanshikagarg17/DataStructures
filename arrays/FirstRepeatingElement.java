package arrays;

import java.util.Scanner;

class FirstRepeatingElement {

    public static void main(String[] args) {

//        take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt(); // length of the array
        System.out.println("Enter the Array");

        int a[] = new int[n]; // initialise the array

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt(); // read the array
        }

        System.out.println(firstReturn(a,n));

    }
    public static int firstReturn(int[] a, int n){
        n = a.length;
        int i;
        int p=0;
//        iterate over the loop from 0 to n
        for (i=0; i<n; i++){
//            iterate over the loop from i+1 to n
            for (int j=i+1; j<n; j++){
                if (a[i] == a[j]){
                    return i; // return the index
                }
            }
        }
        return i;

    }

}

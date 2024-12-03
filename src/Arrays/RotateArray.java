package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int arr[] = {10, 5, 6, 20, 100, 10,10, 10};
        int k = 3;
       int[] res = rotateArray(arr, k);
       for(int i = 0 ; i< arr.length; i++)
           System.out.print(res[i]+ " ");
    }

    public static int[] rotateArray(int[] arr, int k){

        int n = arr.length;
        reverse(arr,0, n-1);
        reverse(arr, 1, k-1);
        reverse(arr, k, n-1);

        return arr;
    }

    public static void reverse(int[] arr, int first, int last){

        while(first <= last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;

        }

    }
}

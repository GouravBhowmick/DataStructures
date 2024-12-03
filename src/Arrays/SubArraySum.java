package Arrays;

import java.util.Arrays;

public class SubArraySum {
/*
    Given a 1-based indexing array arr[] of integers and an integer sum.
    You mainly need to return the left and right indexes(1-based indexing) of that subarray.
    In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.
    If no such subarray exists return an array consisting of element -1.*/

    public static int[] findSubArray(int[] arr, int target){

        int startIndex = 0;
        int[] res =  new int[2];
        boolean flag = false;
        while(startIndex < arr.length && flag == false){
            int sum = arr[startIndex];

        for(int i = startIndex+1; i < arr.length; i++) {

            sum = sum + arr[i];

            if (sum == target) {
                res[0] = startIndex + 1;
                res[1] = i + 1;
                flag = true;
                break;
            } else if (sum > target) {
                break;
            }

        }
        startIndex++;
        }

      return res;
    }

    public static void main(String[] args) {

        int arr[] = {10, 5, 6, 20, 200, 10,10, 10};
        System.out.println(Arrays.toString(findSubArray(arr , 15)));
    }
}

package Arrays;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static int missingNumber(int[] arr){

        int len = arr.length;
        int i = 1, j =0;
        Set<Integer> set =  new HashSet<>();
        for(int a = 0 ; a < len; a++){
            set.add(arr[a]);
        }
        while(i <= len){

            if(!set.contains(i)) {
                return i;
            }
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 5};
        System.out.println(missingNumber(arr1));
    }
}

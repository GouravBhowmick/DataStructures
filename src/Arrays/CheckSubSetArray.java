package Arrays;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckSubSetArray {

    public static boolean isSubset(int[] arr, int[] subArr){

        Set<Integer> checkMap = new HashSet();

        for(int i = 0 ; i< arr.length; i++){
            checkMap.add(arr[i]);
        }

        for(int j = 0 ; j < subArr.length; j++){
            if(!checkMap.contains(subArr[j])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] =  {11, 3, 7, 1, 6};
        System.out.println(Boolean.toString(isSubset(arr1, arr2)));
    }
}

package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckSubset {

    public static void main(String[] args) {
        int arr[] = {-10, 5, 6, -20, -100, -10,1, 1000};
        int arr2[] = {-10, 5, 6, -20, -100, -10,1, 3};
        int n = arr.length;
        System.out.println( checkForSubSet(arr, arr2));
    }

    private static boolean checkForSubSet(int[] arr, int[] arr2) {

        Set<Integer> setArray = new HashSet<>();
        for(Integer s : arr){
            setArray.add(s);
        }

        for(Integer s1 : arr2){
            if(!setArray.contains(s1))
                return false;
        }
        return true;

    }
}

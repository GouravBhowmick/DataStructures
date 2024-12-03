package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] arr, int n){

       Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : arr){
            countMap.put(num,
                    countMap.getOrDefault(num, 0) + 1);

            if(countMap.get(num) > n/2){
                return num;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {10, 5, 6, 20, 100, 10,10, 10};
        int n = arr.length;
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(arr, n));
    }
}

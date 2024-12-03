package Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static int count2Sum(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();
         List<List<Integer>> superList = new ArrayList<>();
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(map.containsKey(target - arr[i])){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(target - arr[i]);
                superList.add(list);
                count = count + map.get(target - arr[i]);

            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(superList.toString());

        return count;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int target = 6;
        System.out.println(count2Sum(arr1, target));
    }

}

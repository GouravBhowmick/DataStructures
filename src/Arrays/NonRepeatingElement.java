package Arrays;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {

    public static void main(String[] args) {
        int A[] = { 10, 1, 5, 5, 10, 1, 3};
        nonRepeatingElement(A);
    }

    public static void nonRepeatingElement(int[] arr){

        int n = arr.length;
        Map<Integer, Integer> map =  new HashMap<>();
        for(int i = 0; i< n; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+ 1);
        }

        for(int i = 0 ; i< n; i++){

            if(map.get(arr[i]) == 1){
                System.out.println(arr[i]);
                break;
            }

        }

    }
}

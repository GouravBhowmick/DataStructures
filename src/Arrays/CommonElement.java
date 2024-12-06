package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElement {

    public static void commonElement(int[] A, int[] B, int[] C){

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<A.length; i++){
            map.put(A[i], 1);
        }
        for(int i = 0 ; i< B.length; i++){
            map.put(B[i], map.getOrDefault(B[i], 1)+1);
        }
        for(int i = 0; i< C.length; i++){
            map.put(C[i], map.getOrDefault(C[i], 1)+1);
        }

        for(Integer ele : map.keySet()){
            if(map.get(ele) == 3){
                list.add(ele);
            }
        }
        System.out.println(list.toString());

    }

    public static void main(String[] args) {
       int A[] = {1, 5, 10, 20, 30};
       int B[] = {5, 13, 15, 20};
       int C[] = {5, 20};

       commonElement(A, B, C);

    }
}

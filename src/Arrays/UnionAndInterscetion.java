package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndInterscetion {

    public static void main(String[] args) {
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] =  {11, 3, 7, 1, 6};
       union(arr1, arr2);
        System.out.println();
        intersection(arr1, arr2);
    }
    public static void union(int[] arr1, int[] arr2){

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j = 0; j< arr2.length; j++){
            if(!set.contains(arr2[j])){
                set.add(arr2[j]);
            }
        }
        for(Integer ele : set){
            System.out.print(ele + " ")  ;
        }

    }

    public static void intersection(int[] arr1, int[] arr2){

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j = 0; j< arr2.length; j++){
            if(set.contains(arr2[j])){
              list.add(arr2[j]);
            }
        }
        for(Integer ele : list){
            System.out.print(ele + " ")  ;
        }


    }

}

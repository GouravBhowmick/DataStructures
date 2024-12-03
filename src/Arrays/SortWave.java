package Arrays;

import java.util.Arrays;

public class SortWave {

    public void sortInWave(int arr[], int n){

        Arrays.sort(arr);
        for(int i = 0 ; i < n -1;i=i+2){
            swapArray(arr, i, i+1);
        }

    }

    private void swapArray(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {


        SortWave sw = new SortWave();
        int arr[] = {10, 5, 6, 3, 2, 20,100, 80};
        int n = arr.length;

        SortWave sortWave = new SortWave();
        sortWave.sortInWave(arr, n);

        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

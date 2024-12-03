package Arrays;

public class MoveNegative {

    public static void main(String[] args) {


        int arr[] = {-10, 5, 6, -20, -100, -10,1, 1000};
        int n = arr.length;
        moveElements(arr, 0, n-1);
        for(int i = 0; i< n; i++)
            System.out.print(arr[i]+ " ");
    }

    private static void moveElements(int[] arr, int leftInd, int rightInd) {

      while(leftInd <= rightInd){

          if(arr[leftInd] < 0 && arr[rightInd] < 0 ){
              leftInd++;
          }
          else if(arr[leftInd] > 0 && arr[rightInd] < 0){

              int temp = arr[rightInd];
              arr[rightInd] = arr[leftInd];
              arr[leftInd] = temp;
              leftInd++;
              rightInd--;

          }
          else if (arr[leftInd] > 0 && arr[rightInd] > 0){
              rightInd--;
          }
          else{
              leftInd++;
              rightInd--;
          }


      }

    }
}

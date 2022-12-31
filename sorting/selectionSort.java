package sorting;

public class selectionSort {
     public static void main(){
         int[] arr = {3,4,7,1,2};
         int minInd;
         
         for(int i = 0; i<arr.length; i++){
             minInd = i;
             for(int j = i; j<arr.length; j++){
                 if(arr[j]<arr[minInd]){
                     minInd = j;
                 }
             }
             arr[i] = arr[minInd] + arr[i];
             arr[minInd] = arr[i] - arr[minInd];
             arr[i] = arr[i] - arr[minInd];
         }
         
         for(int i:arr){
             System.out.print(i + ", ");
         }
     }
}
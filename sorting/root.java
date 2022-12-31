package sorting;

public class root{
    public static int[] bubbleSort(int arr[]){
        boolean changesDone;
        for(int i = 0; i<arr.length; i++){
            changesDone = false;
            for(int j= 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    changesDone = true;
                }
            }
            if(!changesDone){
                break;
            }
        }
        return arr;
    }
}
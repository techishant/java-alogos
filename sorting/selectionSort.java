package sorting;

public class selectionSort {


    public static int smallest(int[] arr, int base){
        int smallestInd = base;
        for (int i = base; i<arr.length-1; i++){
            if (arr[smallestInd] > arr[i]){
                smallestInd = i;
            }
        }
        return smallestInd;
    }

    public static void main(String[] args){
        int[] arr = new int[10];
        stuffs.fillInt(arr);
        stuffs.print(arr);
        
        for (int i = 0; i<arr.length; i++){
            int smallest = smallest(arr, i);
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        stuffs.print(arr);
    }
}

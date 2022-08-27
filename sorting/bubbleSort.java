package sorting;
public class bubbleSort {
    public static void main(String[] args){
        int[] arr = new int[10];

        stuffs.fillInt(arr);
        stuffs.print(arr);
        
        boolean changesDone = true;
        while(changesDone){
            changesDone=false;
            for (int i = 0; i< arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    changesDone = true;
                }
            }
        }

        
        stuffs.print(arr);
    }
}

package sorting;
public class bubbleSort {
    public static void main(String[] args){
        int[] arr = new int[100000];

        stuffs.fillInt(arr,10000000);
        stuffs.print(arr);
        System.out.println(stuffs.isSorted(arr));
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
        System.out.println(stuffs.isSorted(arr));
    }
}

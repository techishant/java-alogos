package sorting;
public class simpleBubbleSort{
    public static void main(String[] args){
        int[] arr = new int[10];

        stuffs.fillInt(arr);
        stuffs.print(arr);


        for(int i = 0; i <arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        stuffs.print(arr);
    }
}

public class bubbleSort {
    static int[] arr = new int[10000];
    public static void main(String[] args){
        // Filling array with 100 random numbers between 1 to 100;
        fillArray();

        boolean changesDone = true;
        while(changesDone){
            changesDone=false;
            int j = 0;  //
            for (int i = 0; i< arr.length-1-0; i++){
                if (arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    changesDone = true;
                }
            }
            // dis(arr);
            j++;
        }

        dis(arr);
    }

    public static void dis(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void fillArray(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10001);
        }
    }

}

package sorting;

public class bbs{
    public static void main(){
        int arr[] = new int[10];
        stuffs.fillInt(arr);
        
        boolean changesDone;
        int k =0;
        for(int i = 0; i<arr.length; i++){
            changesDone = false;
            for(int j= 0; j<arr.length-i-1; j++){
                k++;
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
        System.out.println(k);
        
        for(int i:arr){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
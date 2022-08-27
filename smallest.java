public class smallest {
    public static void main(String[] args) {
        int[] arr = {3,7,1,2,4};

        int smallestInd = 0;
        for (int i = 0; i<arr.length-1; i++){
            if (arr[smallestInd] > arr[i]){
                smallestInd = i;
            }
        }

        System.out.println(arr[smallestInd]);
    }
}

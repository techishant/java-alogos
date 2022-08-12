public class binarySearch {
    public static void main(String[] args){
        // int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = 1;

        int lastNode = (int)Math.round((double)(0+arr.length)/2);

        while(arr[lastNode] != n){
            if (arr[lastNode] > n){
                lastNode = (int) Math.round((double)(0 + lastNode)/2);
                System.out.println(lastNode);
            }else if (arr[lastNode] < n) {
                lastNode = (int) Math.round((double)(lastNode + arr.length)/2);
            }
        }
// TODO: 1 and 8 not working
// as 1 and 8 gives 0.5 that roounds off bact to 1
        System.out.println("Found " + n + " at " + lastNode);



    }
}

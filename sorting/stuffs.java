package sorting;

public class stuffs {
    public static void print(int[] arr){
        for (int i: arr){
            System.out.print(i + " ");
        }
        System.out.print('\n');
    }

    public static int[] fillInt(int[] arr){
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100+1);
        }
        return arr;
    }
}

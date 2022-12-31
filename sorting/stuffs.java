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
    public static int[] fillInt(int[] arr, int n){
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*n+1);
        }
        return arr;
    }
    public static int[] fillInt(int[] arr, int m, int n){
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*n+m);
        }
        return arr;
    }
    
    public static boolean isSorted(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted(int[] arr, boolean ascending){
        if(ascending){
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        }
        else{
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i]<arr[i+1]){
                    return false;
                }
            }
        }
        
        return true;
    }
}









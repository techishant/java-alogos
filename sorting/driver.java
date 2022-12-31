package sorting;

public class driver{
    public static void main(){
        int n = 100;
        int[] arr = new int[n];
        stuffs.fillInt(arr,n*100);
        long initialTime = 0L;
        long deltaTime = 0L;
        
        System.out.println("Start");
        initialTime= System.nanoTime();
        root.bubbleSort(arr);
        deltaTime = System.nanoTime()-initialTime;
        double dt = deltaTime/Math.pow(10,9);
        
        System.out.println("Times: " + dt);
        System.out.println(stuffs.isSorted(arr));
        }
    }
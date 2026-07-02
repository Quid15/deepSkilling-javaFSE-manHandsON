import java.util.*;
public class Temp {
    static void display(int arr[][]){
        for(int x[]: arr ){
            for(int ele: x){
                System.out.printf("%3d",ele);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] arr = new int[6][];

        for(int i=0;i<arr.length;i++){
            Arrays.fill(arr[i],i+1);
        }
        display(arr);
    }
}

import java.util.*;
public class Temp {
    static void display(int arr[][]){
        for(int x[]: arr){
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] arr = new int[6][];

        for(int i=0;i<arr.length;i++){
            arr[i] = new int[(int) Math.ceil(Math.random()*5)];
            Arrays.fill(arr[i],i+1);
        }
        display(arr);   
    }
}
package part2;

import java.util.Arrays;
//import java.util.Scanner;

public class SwapArrayValue {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        System.out.println("Before Swap: "+Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println("After swap: "+Arrays.toString(arr));
    }
    public static void swap(int[] arr,int x,int y){
        int temp=arr[y];
        arr[y]=arr[x];
        arr[x]=temp;
    }
    
}

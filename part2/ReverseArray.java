package part2;

import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        System.out.println("Before reverse: "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reverse: "+Arrays.toString(arr));
    }
    public static void reverse(int[ ] arr){
        int l=arr.length-1;
        for(int i=0;i<l;i++){
            swap(arr,i,l);
            l--;
        }
    }

    public static void swap(int[] arr,int x,int y){
        int temp=arr[y];
        arr[y]=arr[x];
        arr[x]=temp;
    }
    
}

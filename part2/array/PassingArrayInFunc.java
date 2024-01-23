package part2.array;

import java.util.Scanner;
import java.util.Arrays;

public class PassingArrayInFunc {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[] arr){
        arr[1]=567;
    }
}

package part2.array;
import java.util.Scanner;
import java.util.Arrays;
public class InputArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int num:arr){
            System.out.print(num+ " ");
        }
        //to print whole array at one time
        System.out.println(Arrays.toString(arr));
        input.close();
    }
}
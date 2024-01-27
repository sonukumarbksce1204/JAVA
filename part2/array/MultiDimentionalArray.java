package part2.array;

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimentionalArray{
    public static void main(String[] args){
        /*
                1 2 3
                4 5 6
                7 8 9      like a metrix
        */
        //int[][] arr=new int[3][2]; //here [row][colums] and entry in row in compulsery not columns

        Scanner input=new Scanner(System.in);

        int[][] arr1= {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
        };
        int[][] arr=new int[3][3];
        System.out.println(arr.length);  //no of rows
        //input
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=input.nextInt();
            }
        }
        //output
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

        //output 
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        for(int [] a:arr){
            System.out.println(Arrays.toString(a));
        }
        input.close();
    }
}
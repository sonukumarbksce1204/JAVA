package part1.loops;
import java.util.Scanner;

public class Loops{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        /*
         for(initilization; condition; increment/decrement){
                    //body
         }
         */
        System.out.print("Enter To which no. is to be printed: ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        /*
            initilization
            While(condition){
                //body
                //incremint/decrement
         }
        */
        int j=1;
        while(j<=n){
            System.out.print(j+" ");
            j++;
        }
        System.out.println();
        /*
            do{
                //body
            }while(condition);
        */
        int k=1;
        do{
            System.out.print(k+" ");
            k++;
        }while(k<=n);
        input.close();
    }
}
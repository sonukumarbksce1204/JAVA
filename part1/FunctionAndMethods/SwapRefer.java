package part1.FunctionAndMethods;
import java.util.Scanner;
public class SwapRefer {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int result[]=swap(a,b);
        System.out.print(result[0]+" "+result[1]);
        input.close();
    }

    public static int[] swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        return new int[]{a,b};
    }
    
}

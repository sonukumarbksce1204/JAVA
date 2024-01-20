package part1.sum;
import java.util.Scanner;
public class addOfTwoNum{
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int sum=a+b;
        System.out.println("The sum of two num: "+sum);
        input.close();
    }
}
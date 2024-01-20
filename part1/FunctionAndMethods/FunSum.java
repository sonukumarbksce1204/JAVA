package part1.FunctionAndMethods;
import java.util.Scanner;
public class FunSum {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter the 2 numbers: ");
        num1=input.nextInt();
        num2=input.nextInt();
        int val=sum(num1,num2); 
        System.out.println("Sum is: "+val);
        input.close();
    }
    public static int sum(int num1,int num2){
        return num1+num2;
    }    
}

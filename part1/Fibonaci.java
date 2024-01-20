package part1;
import java.util.Scanner;
public class Fibonaci{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num1=0,num2=1;
        System.out.print("Enter the nth postion: ");
        int r=input.nextInt();
        System.out.print(num1+" "+num2+" ");
        for(int i=0;i<r;i++){
            int temp=num1+num2;
            num1=num2;
            num2=temp;
            System.out.print(temp+" ");
        }
        input.close();
        
    }
}
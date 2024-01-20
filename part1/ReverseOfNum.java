package part1;
import java.util.Scanner;
public class ReverseOfNum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println("Reverse number is: "+rev);
        input.close();
    }
}
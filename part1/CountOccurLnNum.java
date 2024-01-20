package part1;
import java.util.Scanner;
public class CountOccurLnNum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number and value: ");
        int num=input.nextInt();
        int num1=num;
        int val=input.nextInt();
        int count=0;
        while(num>0){
            int temp=num%10;
            if(temp==val){
                count++;
            }
            num/=10;
        }
        System.out.println("Number Of Occurence of "+val+" in "+num1+" is : "+count);
        input.close();
    }
}

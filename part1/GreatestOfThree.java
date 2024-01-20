package part1;
import java.util.Scanner;

public class GreatestOfThree{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any three number: ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        /*
        if(num1>num2&&num1>num3){
            System.out.println(num1+" Is Greater");
        }
        else if(num2>num1&&num2>num3){
            System.out.println(num2+" Is Greater");
        }
        else{
            System.out.println(num3+" Is Greater");
        }
        */
        //Alter
        int max=num1;
        if(num2>max){
            max=num2;
        }
        if(num3>max){
            max=num3;
        }
        System.out.println(max+" Is Greater");
        System.out.println("BuiltIn: "+Math.max(num3,(Math.max(num1,num2))));
        input.close();

    }
}
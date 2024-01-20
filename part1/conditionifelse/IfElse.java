package part1.conditionifelse;
import java.util.Scanner;
public class IfElse{
    public static void main(String[] args){
        /*
        if(condition){
                //body
        }else if(condition){
                //body
        }else{
                //body
        }
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Salary: ");
        int sal=input.nextInt();
        if(sal>5000 && sal<=10000){
            sal+=5000;
        }
        else if(sal>10000){
            sal+=10000;
        }
        else{
            sal+=1000;
        }
        System.out.println("Updated Salary: "+sal);

        input.close();
    }
}
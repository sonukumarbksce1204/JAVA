package part1;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char op=input.next().trim().charAt(0);
        if(op=='+'||op=='-'||op=='*'||op=='/'){
            int num1=input.nextInt();
            int num2=input.nextInt();
            int val=0;
            if(op=='+'){
                val=num1+num2;
            }
            else if(op=='-'){
                val=num1-num2;
            }
            else if(op=='*'){
                val=num1*num2;
            }
            else if(op=='/'){
                val=num1/num2;
            }
            System.out.println(val);
        }
        input.close();
    }
}
package part1.FunctionAndMethods;
import java.util.Scanner;
public class FunOverloading{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        sum(2,3);
        sum(5.5,4.5);
        input.close();
    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(double a,double b){
        System.out.println(a+b);
    }
}

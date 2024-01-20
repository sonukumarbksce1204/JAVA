package part1.FunctionAndMethods;
import java.util.Arrays;
import java.util.Scanner;
public class Varargs {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        var(1,2,3,4,5,6,7,8);
        multi(3,12,"a","abf");
        input.close();
    }

    public static void multi(int a,int b,String ...args){
            System.out.println(a+" "+b+" "+Arrays.toString(args));
    }
    public static void var(int ...arg){

        System.out.println(Arrays.toString(arg));
    }
}

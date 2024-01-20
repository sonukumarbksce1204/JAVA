package part1;
import java.util.Scanner;

public class CheckCase{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        if(ch>='a'&&ch<='z'){
            System.out.println("Lower Case");
        }
        else if(ch>='A'&&ch<='Z'){
            System.out.println("Upper Case");
        }
        
        input.close();
    }
}
package part1.chartrim;
import java.util.Scanner;

public class TrimChar{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        System.out.println(ch);
        input.close();
    }
}
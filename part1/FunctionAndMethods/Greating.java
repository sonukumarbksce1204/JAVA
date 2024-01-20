package part1.FunctionAndMethods;
import java.util.Scanner;
public class Greating {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println(greet(name));
        input.close();
    }
    public static String greet(String name){
        return "Hello "+name;
    }
}

package part1.switchcase;
import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        /*
         switch(expression){
            case one:
                //body
                break;
            case two:
                //body
                break;
            Case three:
                //body
                break;
            default:
                //body
                break;
         }
        */
        String fruit=input.next();
        switch(fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A Red Fruit");
                break;
            case "Orange":
                System.out.println("A round Fruit");
                break;
            default:
                System.out.println("Any Other Fruit");
                break;
        }
        //Enhanced Switch case
        switch(fruit){
            case "Mango"->System.out.println("King of Fruits");
            case "Apple"->System.out.println("A Red Fruit");
            case "Orange"->System.out.println("A round Fruit");
            default->System.out.println("Any Other Fruit");
        }

        input.close();
    }
}
package part1.switchcase;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int id=input.nextInt();
        String dept=input.next();
        switch(id){
            case 1->System.out.println("Ram");
            case 2->System.out.println("Shyam");
            case 3->{
                switch (dept){
                    case "IT"->System.out.println("IT");
                    case "Fin"->System.out.println("Finanince");
                    case "CS"->System.out.println("CS");
                    default->System.out.println("Not Defined");
                }
            }
            default->System.out.println("Invalid Input");
        }
        input.close();
    }
}

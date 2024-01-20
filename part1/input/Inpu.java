package part1.input;
import java.util.Scanner;
public class Inpu{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        // System.out.println(input.nextInt());
        // System.out.println(input.next());
        // System.out.println(input.nextLine());

        //Integer input
        System.out.print("Enter your roll no: ");
        int roll=input.nextInt();
        System.out.println("Your Roll.No is: "+roll);
        //string input
        System.out.print("Enter you First name: ");
        String fname=input.next();
        input.nextLine();
        System.out.println("First name: "+fname);
        System.out.print("Enter your full name: ");
        String fullName=input.nextLine();
        System.out.println("Full Name: "+fullName);
        //float input
        System.out.print("Enter you CGPA: ");
        float cgpa=input.nextFloat();
        System.out.println("CGPA: "+cgpa);
        //System.out.printf("CGPA: %.2f\n"+cgpa);
        boolean b=input.hasNextInt(); //to check weather it is integer or not
        System.out.println("This is int: "+b);
        input.close();
        
    }
}

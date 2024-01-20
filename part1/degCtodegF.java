package part1;
import java.util.Scanner;
public class degCtodegF{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Tempetature in Deg C: ");
        double ce=input.nextDouble();
        double fe=1.8*(ce)+32;
        System.out.printf("Temperature In Deg Fe: %.2f",fe);
        input.close();
    }
}
package part1;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int flag=isPrime(num);
        if(flag==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        System.out.println("Prime: "+Primeb(num));
        input.close();
    }
    public static int isPrime(int n){
        int val=(int)(Math.sqrt(n));
        int flag=1;
        for(int i=2;i<=val;i++){
            if(n%i==0){
                flag++;
            }
            if(flag==3){
                break;
            }
        }
        if(flag==1){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static boolean Primeb(int n){
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;

        }
        return c*c>n;
    }
    
}

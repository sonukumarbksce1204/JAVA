package part1;
import java.util.Scanner;
public class ThreeDigitArmstong {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int ch=input.nextInt();
        if(ch==1){
            int n=input.nextInt();
            System.out.println(ArmCheck(n));
        }
        else{
            Armstrong();
        }
        input.close();
    }
    public static void Armstrong(){
        int a;
        for(int i=101;i<999;i++){
            a=i;
            int sum=0;
            while(a>0){
                int rem=a%10;
                a/=10;
                sum+=Math.pow(rem,3);
            }
            //System.out.println(sum);
            if(sum==i){
                System.out.println(i);
            }
        }
    }
    public static boolean ArmCheck(int n){
        int num=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            n/=10;
            sum+=Math.pow(r,3);
        }
            return sum==num;   
        }
}

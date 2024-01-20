package part1.typeconver;
import java.util.Scanner;
public class TypeCast{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=(int)input.nextFloat();
        System.out.println(a);
        int b='A';
        System.out.println(b);
        byte x=25; //max limit if 257-> 257%256=1;
        System.out.println(x);
        input.close();
    }
}

package part2.array;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        /*
         * Syntax:
           ArrayList<DataType> var_nam= new ArrayList<DataType>(Initialcapacity);
           //datatypes must be wrapper class
        */

        ArrayList<Integer> list=new ArrayList<Integer>(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        System.out.println(list.contains(10));  //list.contains(value) reteun true is element is inside the list
        System.out.println(list);
        list.set(0,101);                    //list.set(index,updating_val); it is used to update the vlaue of list
        list.remove(2);          //list.remove(index); it is used to remove the element at that perticular index

        ArrayList<Integer> list2=new ArrayList<Integer>(5);
        //input
        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }
        //output
        for(int i=0;i<5;i++){
            System.out.println(list2.get(i));     //list.get(index); it is used to get the value at that index
        }

    }
    
}

package part2;

public class MaxValueOfArray {
    public static void main(String[] args){
        int[] arr={12,45,2,10,6,77};
        int val=max(arr);
        System.out.println(val);
    }
    public static int max(int[] arr){
        int v=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>v){
                v=arr[i];
            }
        }
        return v;
    }
}

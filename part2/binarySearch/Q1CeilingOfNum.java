package part2.binarySearch;

public class Q1CeilingOfNum {
    public int binaryCeiling(int[] arr,int target){
        int l=0;
        int up=arr.length-1;
        while(l<=up){
            int mid=l+(up-l)/2;
            if(arr[mid]==target) return mid;
            else if(target>arr[mid]) l=mid+1;
            else up=mid-1;
        }
        return l;
    }

    public static void main(String[] args){
        int[] arr={1,4,7,9,12,15,17,18};
        Q1CeilingOfNum obj=new Q1CeilingOfNum();
        int pos=obj.binaryCeiling(arr,2);
        System.out.println(arr[pos]);

    }
    
}

package part2.binarySearch;

public class OrderAgnosticBinarySearch {
    public static int odrerAgnosticBinarySearch(int[] arr,int target){
        boolean f=arr[0]<arr[arr.length-1];
        int l=0;
        int up=arr.length-1;
        if(f==true){
        while(l<=up){
            int mid=l+(up-l)/2;
            if(arr[mid]==target)return mid;
            else if(target>arr[mid])l=mid+1;
            else up=mid-1;
        }
    }else{
        while(l<=up){
            int mid=l+(up-l)/2;
            if(arr[mid]==target)return mid;
            else if(target>arr[mid])up=mid-1;
            else l=mid+1;
        }
    }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={1,4,7,9,12,24,56,89,90,100};
        int [] rra={100,90,89,56,24,12,9,7,4,1};
        int pos1=odrerAgnosticBinarySearch(arr, 1);
        int pos2=odrerAgnosticBinarySearch(rra, 1);
        System.out.println(pos1);
        System.out.println(pos2);
    }
    
}

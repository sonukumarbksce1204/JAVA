package part2.binarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr,int target){
        int l=0;
        int up=arr.length-1;
        
        while(l<=up){
            //int mid=(l+up)/2;
            int mid=l+(up-l)/2;  // best for large values
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }
            else{
                up=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={-9,-5,-4,-1,0,1,4,7,9,12,15,17,45,87,90};
        int pos=binarySearch(arr, -9);
        System.out.println(pos);
    }
    
}

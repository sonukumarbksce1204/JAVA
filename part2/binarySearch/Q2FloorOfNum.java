package part2.binarySearch;
public class Q2FloorOfNum {
    public int q2Floor(int[] arr,int target){
        int l=0;
        int up=arr.length;
        while(l<=up){
            int mid=l+(up-l)/2;
            if(arr[mid]==target)return mid;
            else if(target>arr[mid])l=mid+1;
            else up=mid-1;
        }
        return up;
    }
    public static void main(String[] args){
        int[] arr={1,4,7,8,10,14,24,34};
        Q2FloorOfNum obj=new Q2FloorOfNum();
        int pos=obj.q2Floor(arr, 15);
        System.out.println(arr[pos]);
    }
    
}

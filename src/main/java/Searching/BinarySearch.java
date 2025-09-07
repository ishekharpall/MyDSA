package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 3, 1, 4};
        int target =5;
        int result=  binarySearch(arr,target);
        System.out.println(result);
    }

    static int binarySearch(int arr[], int target){

        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(target == arr[mid]) return mid;
            else if (target<arr[mid]) {
                r=mid-1;

            }else {
                l=mid+1;
            }
        }
        return -1;

    }

}

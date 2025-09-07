package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 3, 1, 4};
        int target =4;
        int result=  linearSearch(arr,target);
        System.out.println(result);
    }

    static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

}

package Array;

public class missingNumber {
    public static void main(String[] args) {

        int[] arr={1,2,4,5,6,7,8,9};
        System.out.println(missing(arr));
    }

    static int missing(int arr[]){
        int n = arr.length +1;
        int sum=n*(n+1)/2;
        int missing = 0;
        int temp = 0;

        for(int i=0;i<arr.length;i++){
            temp= temp+arr[i];
            missing = sum-temp;
        }
        return missing;
    }
}

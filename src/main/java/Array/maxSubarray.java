package Array;

import java.util.ArrayList;

public class maxSubarray {

    public static void main(String[] args) {
        int[] arr = {1,2,-3,3,4,-9,2};
        System.out.println(maxSum(arr));
        System.out.println(kadaneAlgo(arr));
        System.out.println(subArrayOfSizeK(arr,-7));

    }
    static ArrayList<Integer>  maxSum(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int start =0;
        int end =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int currentSum = 0;
            for(int j=i;j<arr.length;j++){
                currentSum = currentSum +arr[j];
                if(maxSum<currentSum){
                    maxSum = Math.max(maxSum,currentSum);
                    start = i;
                    end = j;
                }
            }
        }
        for(int k=start;k<=end;k++){
            result.add(arr[k]);

        }
       // result.add(maxSum);
        return result;
    }
    static int kadaneAlgo(int arr[]){
        int maxSum= arr[0];
        int currentMax = arr[0];
// arr = {1,2,-3,3,4,-9,2};
        for(int i=1;i<arr.length;i++){
            currentMax = Math.max(arr[i],currentMax+arr[i]);//3,0,3,7,-2,0
            maxSum = Math.max(maxSum,currentMax);           //3,3,3,7,7,7
        }
        return maxSum;
    }
    static ArrayList<Integer>  subArrayOfSizeK(int[] arr , int k){
        ArrayList<Integer> result = new ArrayList<>();
        int start =0;
        int end =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int currentSum = 0;
            for(int j=i;j<arr.length;j++){
                currentSum = currentSum +arr[j];
                if(k==currentSum){
                    start = i;
                    end = j;
                }
            }
        }
        for(int p=start;p<=end;p++){
            result.add(arr[p]);
        }
        return result;
    }

}

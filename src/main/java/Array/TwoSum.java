package Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class TwoSum {
    public static void main(String[] args){
        int[] arr= {12,23,11,45,34,22};
        int target = 34;
        Arrays.sort(arr);
       List<List<Integer>> twoSum1= twoSumOfNo(arr,target);
        System.out.println(twoSum1);
        int[] res = twoSum(arr, target);
        System.out.println(res[0] + " " + res[1]);
//        for (int num : twoSum) {
//            System.out.print(num + " ");
//        }
    }

    static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> temp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int minus = target - arr[i];
            if(temp.containsKey(minus)){
                return new int[] {temp.get(minus),i};
            }
            temp.put(arr[i],i);
        }

        return new int[] {};

    }

    static List<List<Integer>> twoSumOfNo(int[] arr, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int l=0;
        int r= arr.length-1;

        while(l<r){

            if(l>0 && arr[l]==arr[l-1]){
                l++;
                continue;
            }
            if(r<arr.length-1 && arr[r]==arr[r+1]){
                r--;
                continue;
            }
            if(arr[l]+arr[r]>target){
                r--;
            }else if(arr[l]+arr[r]<target){
                l++;
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(arr[l]);
                list.add(arr[r]);
                result.add(list);

                l++;
                r--;

            }
        }
        return result;

    }
}

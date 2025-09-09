package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class kMostFrequent {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1,1,2,7,7,7,7,7,7,2,8,8,8,8,8,8,8,1};

        System.out.println(bruteForce(arr,3));

    }
    static ArrayList<Integer> bruteForce(int [] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int n:arr){
            map.put(n,map.getOrDefault(n,0) + 1);
        }

        for(int i=0;i<k;i++) {
            int maxKey =-1;
            int maxValue = Integer.MIN_VALUE;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            result.add(maxKey);
            map.remove(maxKey);
        }
       return result;

    }
}

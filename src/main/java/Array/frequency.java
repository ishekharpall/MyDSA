package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,3,3,3,3,4,5,6,7);

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        //max frequency element
        int maxFreq =0;
        int element = -1;

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq = entry.getValue();
                element = entry.getKey();
            }

        }
        System.out.println(freq);
        System.out.println(element+" : "+maxFreq);
    }


}


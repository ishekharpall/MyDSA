package HashMap;

import java.util.HashMap;

public class learnHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"S");
        hashMap.put(2,"h");
        hashMap.put(3,"e");
        hashMap.put(4,"k");
        hashMap.put(5,"h");
        hashMap.put(6,"a");
        hashMap.put(7,"r");
       // System.out.println(hashMap);

        for(Integer key : hashMap.keySet() ){
            System.out.println(key +" => "+hashMap.get(key));
        }
        System.out.println();

       // hashMap.remove(5);

        for(Integer key : hashMap.keySet() ){
            System.out.println(key +" => "+hashMap.get(key));
        }

        System.out.println(hashMap.containsKey(9));
        System.out.println(hashMap.containsValue("S"));
        System.out.println(hashMap.size());

      //  hashMap.replace(2,"P");
        for(Integer key : hashMap.keySet() ){
            System.out.println(key +" => "+hashMap.get(key));
        }
       // hashMap.clear();

    }
}

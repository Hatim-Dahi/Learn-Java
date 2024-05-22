import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        HashMap<Integer, Integer>mp= new HashMap<>();
        for(int i=0;i<6;i++){
            //add key-value pair
            mp.put(arr[i],i);
        }
        //print the whole hasmap
        System.out.println(mp);
        
        // Using entrySet() to iterate over key-value pairs
        for(Map.Entry<Integer, Integer> i: mp.entrySet()){
            System.out.println(i.getKey() + "="+  i.getValue());
        }

        mp.remove(2);
        System.out.println(mp);
    }
}

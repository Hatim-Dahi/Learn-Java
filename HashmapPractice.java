import java.util.*;

public class HashmapPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        // put all elements in map
        for (int i = 0; i < 5; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        int key = sc.nextInt();
        System.out.println(key + "--" + mp.get(key));

        //print all elements with key-value
        for(Map.Entry<Integer, Integer> i:mp.entrySet()){
            System.out.println(i.getKey()+"--"+i.getValue());
        }
        
    }
}

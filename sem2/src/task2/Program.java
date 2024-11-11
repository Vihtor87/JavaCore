package task2;

import java.util.Arrays;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {

        int[] arr1 = {7, 2, 6, 6, 0, 0, 1, 2, 2, 1, 5, 3, 4, 3, 5, 6, 4};
        System.out.println(Arrays.toString(sortByBirds(arr1)));
    }

    public static int[] sortByBirds(int[] arr) {
        int[] res = new int[arr.length];
        HashMap <Integer, Integer> resMap = new HashMap<>();

        for (int k : arr) {
            resMap.put(k, resMap.getOrDefault(k, 0) + 1);
//            if (!resMap.containsKey(k)) {
//                resMap.put(k, 1);
//            } else {
//                resMap.put(k, resMap.get(k) + 1);
//            }
        }
        System.out.println("Промежуточный map: " + resMap);

        int i = 0;
        for (Integer key : resMap.keySet()) {
            for (int j = 0; j < resMap.get(key); j++) {
                res[i++] = key;
            }
        }
        System.out.print("Отсортированный массив: ");
        return res;
    }
}

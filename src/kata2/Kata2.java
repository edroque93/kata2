package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Kata2 {

    public static void main(String[] args) {
        int[] vector = {3, 2, 2, 3, 3, 1, 2, 1, 1, 1, 1, 3};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];

            if (hashMap.get(j) != null) {
                hashMap.put(j, hashMap.get(j) + 1);
            } else {
                hashMap.put(j, 1);
            }
        }

        Iterator iterator = hashMap.entrySet().iterator();

        int max = 0;
        int key = 0;

        while (iterator.hasNext()) {
            Entry<Integer, Integer> aux = (Entry<Integer, Integer>) iterator.next();

            if (aux.getValue() > max) {
                max = aux.getValue();
                key = aux.getKey();
            }
        }

        System.out.println(key + " se repite " + max);
    }
}

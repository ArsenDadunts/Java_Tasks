import java.util.Collections;
import java.util.HashMap;

public class KnapsackProblem {
    public static void main(String[] args) {
        int w = 10;
        int[] val = {10, 40, 30, 50, 20, 80, 90, 70};
        int[] wt = {5, 4, 6, 4, 8, 2, 9, 9};

        HashMap<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < wt.length; i++) {
            for (int j = i+1; j < wt.length; j++) {
                cache.put(wt[i] + wt[j], val[i] + val[j]);
            }
        }
        getMaxvalueInMap(cache,w);

    }
    public static <K, V extends Integer> K getMaxvalueInMap(HashMap<K, V> cache, int w) {

        V maxValueInMap = (Collections.max(cache.values()));
        Integer weight = (Integer) getKey(cache, maxValueInMap);
        if (weight <= w) {
            System.out.println("The largest total value is " + maxValueInMap + " by weight " + weight);
            System.exit(0);
        } else {
            HashMap<Integer, Integer> cache2 = new HashMap<>();
            for (int i = 0; i < cache.size(); i++) {
                if (weight.equals(getKey(cache, maxValueInMap))) {
                    cache.remove(getKey(cache, maxValueInMap));
                    cache2 = (HashMap<Integer, Integer>) cache.clone();
                    return (K) getMaxvalueInMap(cache2, w);
                }
            }
        }
        return null;
    }

    public static <K, V> K getKey(HashMap<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value==(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}

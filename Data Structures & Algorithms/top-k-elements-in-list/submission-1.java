


class Solution {
    
public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

    Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
        @Override
        public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
            return b.getValue() - a.getValue(); 
        }
    });

    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = entryList.get(i).getKey();
    }

    return result;
}
}

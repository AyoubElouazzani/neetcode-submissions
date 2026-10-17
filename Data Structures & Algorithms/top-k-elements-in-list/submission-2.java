


class Solution {
    
public int[] topKFrequent(int[] nums, int k) {
   
    Arrays.sort(nums);
    HashMap<Integer, Integer> dict = new HashMap<>();
    for (int i=0 ; i<nums.length ; i++){
        if (!dict.containsKey( nums[i] )) {
            dict.put(nums[i], 1);
        }
        else{
        dict.put(nums[i], dict.get(nums[i]) + 1);
        }
    }
    
    
    List<Integer> result = new ArrayList<>();

        // Sort keys by their values (descending)
    List<Integer> keys = new ArrayList<>(dict.keySet());

    keys.sort((a, b) -> Integer.compare(dict.get(b), dict.get(a)));

        // Take the first k keys
        for (int i = 0; i < Math.min(k, keys.size()); i++) {
            result.add(keys.get(i));
        }
    
    return result.stream().mapToInt(Integer::intValue).toArray();
 }
}


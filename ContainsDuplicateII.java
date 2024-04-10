import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // int i = 0;
        // int j = k;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        // while (j < nums.length) {
            
        // }

        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicateII algo = new ContainsDuplicateII();
        algo.containsNearbyDuplicate(new int[]{1,2,3,1}, 3);
    }
}

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need) && map.get(need) != i) {
                return new int[]{map.get(need), i};
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        
    }
}

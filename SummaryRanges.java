import java.util.*;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int start = 0;

        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }
        
        for (int i = 1; i < nums.length; i++) { 
            if (nums[i] != nums[i - 1] + 1) {
                // s = "nums[i - 1]";
                if (start == i - 1) {
                    result.add(String.valueOf(nums[i-1]));
                } else {
                    result.add(nums[start] + "->" + nums[i-1]);
                }
                start = i;
            }

            if (i == nums.length - 1) {
                if (start == i) {
                    result.add(String.valueOf(nums[i]));
                } else {
                    result.add(nums[start] + "->" + nums[i]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SummaryRanges algo = new SummaryRanges();
        algo.summaryRanges(new int[]{0,1,2,4,5,7});
        algo.summaryRanges(new int[]{0,2,3,4,6,8,9});
    }
}

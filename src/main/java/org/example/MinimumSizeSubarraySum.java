public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int maxSum = 0;
        int left = 0;
        int right = 0;
        int minLen = nums.length;
        
        while (right < nums.length) {
            maxSum += nums[right];

            while (maxSum >= target && left <= right) {
                int afterPopedValue = maxSum - nums[left];
                int distance = right - left + 1;
                if (afterPopedValue < target && distance < minLen) {
                    minLen = distance;
                }
                maxSum = afterPopedValue;
                left++;
            }

            right++;
        }

        if (right == nums.length && left == 0) {
            return 0;
        }

        return minLen;
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum algo = new MinimumSizeSubarraySum();
        algo.minSubArrayLen(7, new int[]{2,3,1,2,4,3}); 
    }
}

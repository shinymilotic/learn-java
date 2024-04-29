public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int maxCapacity = nums[0] + 0;

        for (int i = 0; i < nums.length; i++) {
            int capacity = nums[i] + i;

            if (maxCapacity < i) {
                return false;
            } else if (capacity >= nums.length - 1) {
                return true;
            }

            maxCapacity = Math.max(maxCapacity, capacity);
        }

        return false;
    }

    public static void main(String[] args) {
        
    }
}

public class JumpGameII {
    public int jump(int[] nums) {
        int maxJumpCapacity = nums[0] + 0;
        int jumpCount = 0;

        if (nums.length <= 1) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            int capacity = nums[i] + i;

            if (maxJumpCapacity > i) {
                if (capacity >= nums.length - 1) {
                    // jump + 1;
                    
                    // if jump < minJump -> minJump = jump
                    System.out.println(maxJumpCapacity);
                    
                    // reset jump
                }

                if (capacity >= maxJumpCapacity) {
                    maxJumpCapacity = capacity;  
                }

                // if
            } else {
                return 0;
            }
        }


        return 0;
    }
    public static void main(String[] args) {
        JumpGameII algo = new JumpGameII();
        algo.jump(new int[]{2,3,1,1,4});
    }
}

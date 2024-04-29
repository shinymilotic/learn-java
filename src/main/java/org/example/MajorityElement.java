class MajorityElement {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 0;

        for (int num : nums) {
            if(count == 0) {
                major = num;
            }

            if(num != major) {
                count--;
            } else {
                count++;
            }
        }

        return major;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        MajorityElement algo = new MajorityElement();
        algo.majorityElement(nums);
    }
}
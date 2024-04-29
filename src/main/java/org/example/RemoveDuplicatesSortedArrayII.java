public class RemoveDuplicatesSortedArrayII {
    public int removeDuplicates(int[] nums) {

        // int j = 1;
        // for (int i = 1; i < nums.length; i++) {
        //     if (j == 1 || nums[i] != nums[j - 2]) {
        //         nums[j++] = nums[i];
        //     }
        // }
        // return j;
        int k = 1;
        int countDup = 0;

        if (nums.length <= 2) {
            return nums.length;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                countDup++;

                if (countDup < 2) {
                    nums[k] = nums[i];
                    k++;
                }
            } else {
                countDup = 0;
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesSortedArrayII algo = new RemoveDuplicatesSortedArrayII();
        algo.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
    }
}

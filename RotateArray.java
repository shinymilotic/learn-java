public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] shadow = new int[nums.length];

        for (int i = 0; i < nums.length; i--) {
            int j = getShadowIndex(i, k, nums.length);
            shadow[j] = nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = shadow[i];
        }
    }

    public int getShadowIndex(int i, int k, int n) {
        int j = 0;
        while (k > n) {
            k = n - k;
        }

        if (i < k) {
            j = n - (k - i);
        } else {
            j = i - k;
        }

        return j;
    }

    public static void main(String[] args) {
        RotateArray algo = new RotateArray();
        algo.rotate(new int[]{1,2,3,4,5,6,7}, 1);
    }
}

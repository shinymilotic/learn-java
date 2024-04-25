public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;

        while (index1 < index2) {
            if (numbers[index1] + numbers[index2] == target) {
                return new int[] {index1 + 1, index2 + 1};
            } else if (numbers[index1] + numbers[index2] > target) {
                index2--;
            } else if (numbers[index1] + numbers[index2] < target) {
                index1++;
            }
        }


        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSumII algo = new TwoSumII();
        algo.twoSum(new int[]{2,7,11,15}, 9);
    }
}

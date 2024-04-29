public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int maxGasStation = 0;
        int changeInACircuit = 0;
        int[] change = new int[gas.length];

        for (int i = 0; i < change.length; i++) {
            change[i] = (gas[i] - cost[i]);

            if (change[i] >= change[maxGasStation]) {
                maxGasStation = i;
            }

            changeInACircuit += change[i];
        }

        if (changeInACircuit + change[maxGasStation] >= 0 ) {
            return maxGasStation;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        GasStation algo = new GasStation();
        algo.canCompleteCircuit(new int[]{5,8,2,8}, new int[]{6,5,6,6});
    }
}

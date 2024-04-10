public class HappyNumber {

    public boolean isHappy(int n) {
        
        double sum = 0;
        int init = n;
        while (n / 10 > 0) {
            int digit = n % 10;
            n = n / 10;
            sum = sum + Math.pow(2, digit);
        }
        return false;
    }

    public static void main(String[] args) {
        HappyNumber algo = new HappyNumber();
        algo.isHappy(19);
    }
}

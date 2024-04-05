public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int len = t.length();
        int sLen = s.length();
        int j = 0;

        if (sLen == 0) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }

            if (j == sLen) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
    }
}

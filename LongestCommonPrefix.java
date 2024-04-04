public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            commonPrefix = commonString(commonPrefix, strs[i]);
        }
        return commonPrefix;
    }

    public String commonString(String first, String second) {
        StringBuilder commonStr = new StringBuilder();
        int firstLen = first.length();
        int secondLen = second.length();
        int k = 0;
        if (firstLen <= secondLen) {
            k = firstLen;
        } else {
            k = secondLen;
        }
        
        for (int i = 0; i < k; i++) {
            if (first.charAt(i) == second.charAt(i)) {
                commonStr.append(first.charAt(i));
            } else {
                break;
            }
        }
        
        return commonStr.toString();
    }

    public static void main(String[] args) {
        
    }
}

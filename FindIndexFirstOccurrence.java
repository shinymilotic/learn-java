public class FindIndexFirstOccurrence {

    public int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length(); 
        int j = 0;
        int firstOcc = -1;
        for (int i = 0; i < haystackLen;) {
            for (int k = i; k <= i + needleLen - 1; k++) {
                if (haystack.charAt(k) == needle.charAt(j)) {
                    if (j == 0) {
                        firstOcc = k;
                    }
                    j++;
                } else {
                    j = 0;
                }
            }

            if (j == needleLen - 1) {
                return firstOcc;
            }
        }
        
        return firstOcc;
    }

    public static void main(String[] args) {
        String haystack ="mississippi";
        String needle = "issip";        
        FindIndexFirstOccurrence algo = new FindIndexFirstOccurrence();
        algo.strStr(haystack, needle);
    }
}

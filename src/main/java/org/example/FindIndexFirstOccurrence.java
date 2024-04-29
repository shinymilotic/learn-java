public class FindIndexFirstOccurrence {

    public int strStr(String haystack, String needle) {
        int lenHayStack = haystack.length();
        int lenNeedle = needle.length();

        int start = 0;
        int end = lenNeedle - 1;
        while (end < lenHayStack) {
            System.out.println(start + '-' + end);

            while (start < end) {
                
            }
            start++;
            end++;
        }

        return 0;
    }

    public static void main(String[] args) {
        String haystack ="mississippi";
        String needle = "issip";        
        FindIndexFirstOccurrence algo = new FindIndexFirstOccurrence();
        algo.strStr(haystack, needle);
    }
}

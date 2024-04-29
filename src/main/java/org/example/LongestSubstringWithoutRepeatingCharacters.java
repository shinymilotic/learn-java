import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int longestLength = 1;
        int left = 0;
        int right = 0;
        Map<Character, Integer> charMap = new HashMap<>();

        if ("".equals(s)) {
            return 0;
        }

        while (right < len) {
            char currentItem = s.charAt(right);

            if (charMap.containsKey(currentItem) &&
                charMap.get(currentItem) >= left &&
                charMap.get(currentItem) < right) {

                int lenOfSubStr = right - left;
                if (lenOfSubStr > longestLength) {
                    longestLength = lenOfSubStr;
                }

                left = charMap.get(currentItem) + 1;
            }

            charMap.put(currentItem, right);
            right++;
        }

        int lenOfLastSubStr = right - left;

        if (lenOfLastSubStr > longestLength) {
            longestLength = lenOfLastSubStr;
        }

        return longestLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters algo = new LongestSubstringWithoutRepeatingCharacters();
        algo.lengthOfLongestSubstring("aab");
    }
}

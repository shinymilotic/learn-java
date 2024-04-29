import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        int sLen = s.length();
        int tLen = t.length();

        for (int i = 0; i < sLen; i++) {
            if (sMap.containsKey(s.charAt(i))) {
                int key = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), key + 1);
            } else {
                sMap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < tLen; i++) {
            if (sMap.containsKey(t.charAt(i))) {
                int value = sMap.get(t.charAt(i));

                if (value == 1) {
                    sMap.remove(t.charAt(i));
                } else {
                    sMap.put(t.charAt(i), value - 1);
                }
            } else {
                return false;
            }
        }

        if (!sMap.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram algo = new ValidAnagram();
        algo.isAnagram(null, null);
    }
}

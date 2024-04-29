import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMapS = new HashMap<>();
        Map<Character, Character> charMapT = new HashMap<>();
        int slen = s.length();
        int tLen = t.length();

        if (slen != tLen) {
            return false;
        }

        for (int i = 0; i < slen; i++) {
            if (!charMapS.containsKey(s.charAt(i))) {
                charMapS.put(s.charAt(i), t.charAt(i));
            } else {
                if (t.charAt(i) != charMapS.get(s.charAt(i))) {
                    return false;
                }
            }

            if (!charMapT.containsKey(t.charAt(i))) {
                charMapT.put(t.charAt(i), s.charAt(i));
            } else {
                if (s.charAt(i) != charMapT.get(t.charAt(i))) {
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings algo = new IsomorphicStrings();
        algo.isIsomorphic("paper", "title");
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RansomeNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int magazineLen = magazine.length();
        int ransomeLen = ransomNote.length();
        Map<Character, Integer> charSet = new HashMap<>();

        for (int i = 0; i < magazineLen; i++) {
            if (!charSet.containsKey(magazine.charAt(i))) {
                charSet.put(magazine.charAt(i), 1);
            } else {
                charSet.replace(magazine.charAt(i), charSet.get(magazine.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < ransomeLen; i++) {
            if (charSet.containsKey(ransomNote.charAt(i))) {
                if (charSet.get(ransomNote.charAt(i)).equals(0)) {
                    return false;
                } else {
                    charSet.replace(ransomNote.charAt(i), charSet.get(ransomNote.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        RansomeNote algo = new RansomeNote();
        algo.canConstruct("aa", "ab");
    }
}

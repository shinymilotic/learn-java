import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        int sLen = s.length();
        Map<String, Character> sMap = new HashMap<>();
        Map<Character, String> tMap = new HashMap<>();
        int j = 0;
        int pLen = pattern.length();
        StringBuilder strTemp = new StringBuilder();

         for (int i = 0; i < sLen; i++) {

            // if there is a character, construct word
            if (s.charAt(i) != ' ' || i == sLen - 1) {
                strTemp.append(s.charAt(i));
            }
            String str = strTemp.toString();

            // process a word
            if ((s.charAt(i) == ' ' || i == sLen - 1) && !str.equals("")) {
                if (j >= pLen || (i == sLen - 1 && j < pLen - 1)) {
                    return false;
                }

                if (sMap.containsKey(str)) {
                    if (!sMap.get(str).equals(pattern.charAt(j))) {
                       return false; 
                    }
                } else {
                    sMap.put(str, pattern.charAt(j));
                }

                if (tMap.containsKey(pattern.charAt(j))) {
                    if (!tMap.get(pattern.charAt(j)).equals(str)) {
                        return false;
                    }
                } else {
                    tMap.put(pattern.charAt(j), str);
                }
                j++;
                
                
                // reset word
                strTemp = new StringBuilder();
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        wordPattern.wordPattern("aaa", "aa aa aa aa");
    }
}

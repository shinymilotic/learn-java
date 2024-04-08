public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        int sLen = s.length();
        StringBuilder strTemp = new StringBuilder();

        for (int i = 0; i < sLen; i++) {
            String str = strTemp.toString();

            // if there is a character, construct word
            if (s.charAt(i) != ' ') {
                strTemp.append(s.charAt(i));
            }

            // process a word
            if (s.charAt(i) == ' ' && !str.equals("")) {

                // reset word
                strTemp = new StringBuilder();
            }

            

        }
        
        return false;
    }
    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        wordPattern.wordPattern("abba", "dog cat cat dog");
    }
}

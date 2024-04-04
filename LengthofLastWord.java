public class LengthofLastWord {
    // Given a string s consisting of words and spaces, return the length of the last word in the string.

    // A word is a maximal 
    // substring
    //  consisting of non-space characters only.
    public int lengthOfLastWord(String s) {
        int lastIndex = s.length() - 1;
        int lengthOfLastWord = 0;
        for (int i = lastIndex; i >= 0; i--) {
            char word = s.charAt(i);

            if (word != ' ') {
                lengthOfLastWord++;
            } else if (lengthOfLastWord > 0) {
                break;
            }
        }
        return lengthOfLastWord;
    }
    
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
    }
}

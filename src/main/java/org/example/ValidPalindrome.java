public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int len = s.length();
        int i = 0;
        int j = len - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        ValidPalindrome algo = new ValidPalindrome();
        algo.isPalindrome(s);
    }
}

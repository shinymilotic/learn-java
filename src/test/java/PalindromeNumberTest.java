import org.example.PalindromeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    private final PalindromeNumber algo = new PalindromeNumber();

    @Test
    public void negativeNumber() {
        boolean result = algo.isPalindrome(-232);

        Assertions.assertEquals(result, false);
    }

    @Test
    public void singleNumber() {
        boolean result = algo.isPalindrome(2);

        Assertions.assertEquals(result, true);
    }

    @Test
    public void zeroAtTheEnd() {
        boolean result = algo.isPalindrome(20);

        Assertions.assertEquals(result, false);
    }

    @Test
    public void palindrome() {
        boolean result = algo.isPalindrome(22322);

        Assertions.assertEquals(result, true);
    }

    @Test
    public void notPalindrome() {
        boolean result = algo.isPalindrome(2334);

        Assertions.assertEquals(result, false);
    }
}

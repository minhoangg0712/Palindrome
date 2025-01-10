import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testNullString() {
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    void testEmptyString() {
        assertTrue(StringUtils.isPalindrome(""));
    }

    @Test
    void testWhitespaceOnly() {
        assertTrue(StringUtils.isPalindrome("   "));
    }

    @Test
    void testPalindromeSimple() {
        assertTrue(StringUtils.isPalindrome("aba"));
    }

    @Test
    void testPalindromeWithSpacesAndCase() {
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(StringUtils.isPalindrome("a"));
    }

    @Test
    void testPalindromeWithSpecialCharacters() {
        assertTrue(StringUtils.isPalindrome("12321"));
        assertFalse(StringUtils.isPalindrome("12345"));
    }
}

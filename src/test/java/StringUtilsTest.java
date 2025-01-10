import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testPalindromeWithNormalString() {
        assertTrue(StringUtils.isPalindrome("radar"));
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("level"));
    }

    @Test
    void testNonPalindromeString() {
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome("java"));
        assertFalse(StringUtils.isPalindrome("programming"));
    }

    @Test
    void testEmptyString() {
        assertTrue(StringUtils.isPalindrome(""));
    }

    @Test
    void testNullString() {
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    void testSingleCharacterString() {
        assertTrue(StringUtils.isPalindrome("a"));
        assertTrue(StringUtils.isPalindrome("z"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(StringUtils.isPalindrome("nurses run")); // Xử lý khoảng trắng
    }

    @Test
    void testPalindromeWithSpacesAndMixedCase() {
        assertTrue(StringUtils.isPalindrome("Nurses Run"));
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
        assertFalse(StringUtils.isPalindrome("Hello World"));
    }
}

public class StringUtils {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        // Tiền xử lý: Bỏ khoảng trắng và chuyển chữ thường
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

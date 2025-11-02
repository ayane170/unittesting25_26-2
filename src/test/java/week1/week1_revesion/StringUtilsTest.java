package week1.week1_revesion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test
    void test_isPalindrome() {
        assertTrue(utils.isPalindrome("kayak"));
    }
    @Test
    void test_isPalindrome_false() {
        assertFalse(utils.isPalindrome("amo"));
    }

    @Test
    void test_isUpperCase() {
        assertTrue(utils.isUpperCase("HELLO"));
    }
    @Test
    void test_isLowerCase() {
        assertFalse(utils.isUpperCase("Java"));
    }

}
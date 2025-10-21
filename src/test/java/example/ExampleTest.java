package example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExampleTest {

    @Test
    public void testReverseString() {
        // 测试正常字符串反转
        assertEquals("olleh", Example.reverseString("hello"));
        assertEquals("54321", Example.reverseString("12345"));
        assertEquals("", Example.reverseString(""));
        
        // 测试null情况
        assertEquals(null, Example.reverseString(null));
        
        // 测试包含空格的字符串
        assertEquals("dlrow olleh", Example.reverseString("hello world"));
    }

    @Test
    public void testIsPalindrome() {
        // 测试回文字符串
        assertTrue(Example.isPalindrome("racecar"));
        assertTrue(Example.isPalindrome("madam"));
        assertTrue(Example.isPalindrome("a"));
        assertTrue(Example.isPalindrome(""));
        
        // 测试非回文字符串
        assertFalse(Example.isPalindrome("hello"));
        assertFalse(Example.isPalindrome("world"));
        assertFalse(Example.isPalindrome("abc"));
        
        // 测试null情况
        assertFalse(Example.isPalindrome(null));
        
        // 测试大小写敏感的回文
        assertFalse(Example.isPalindrome("Racecar"));
    }

    @Test
    public void testFactorial() {
        // 测试边界情况
        assertEquals(1, Example.factorial(0));
        assertEquals(1, Example.factorial(1));
        
        // 测试正常情况
        assertEquals(2, Example.factorial(2));
        assertEquals(6, Example.factorial(3));
        assertEquals(24, Example.factorial(4));
        assertEquals(120, Example.factorial(5));
        
        // 测试较大数字
        assertEquals(3628800, Example.factorial(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithNegativeNumber() {
        // 测试负数应该抛出异常
        Example.factorial(-1);
    }

    @Test
    public void testIsPrime() {
        // 测试素数
        assertTrue(Example.isPrime(2));
        assertTrue(Example.isPrime(3));
        assertTrue(Example.isPrime(5));
        assertTrue(Example.isPrime(7));
        assertTrue(Example.isPrime(11));
        assertTrue(Example.isPrime(13));
        assertTrue(Example.isPrime(17));
        
        // 测试非素数
        assertFalse(Example.isPrime(1));
        assertFalse(Example.isPrime(4));
        assertFalse(Example.isPrime(6));
        assertFalse(Example.isPrime(8));
        assertFalse(Example.isPrime(9));
        assertFalse(Example.isPrime(10));
        assertFalse(Example.isPrime(15));
        
        // 测试边界情况
        assertFalse(Example.isPrime(0));
        assertFalse(Example.isPrime(-1));
    }
}
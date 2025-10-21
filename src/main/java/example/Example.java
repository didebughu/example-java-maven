package example;

public class Example {
    
    /**
     * 反转字符串
     * @param str 输入字符串
     * @return 反转后的字符串
     */
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
    
    /**
     * 判断字符串是否为回文
     * @param str 输入字符串
     * @return 如果是回文返回true，否则返回false
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String reversed = reverseString(str);
        return str.equals(reversed);
    }
    
    /**
     * 计算阶乘
     * @param n 非负整数
     * @return n的阶乘
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("阶乘只能计算非负整数");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * 判断数字是否为素数
     * @param num 要判断的数字
     * @return 如果是素数返回true，否则返回false
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

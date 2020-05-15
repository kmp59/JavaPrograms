public class NumPalindrome {
    public static boolean isPalindrome(int num){
        int reverse = 0;
        num = Math.abs(num);
        int original = num;
        while(num > 0){
            int lastDigit = num % 10;
            reverse *= 10;
            reverse = reverse + lastDigit;
            num /= 10;
        }
        return (reverse == original);
    }
}

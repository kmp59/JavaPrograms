public class DigitSum {
    public static int sumDigits(int Num){
        if(Num < 10)return -1;
        int sum = 0;
        while(Num > 0){
            int digit = Num % 10;
            sum += digit;
            Num /= 10;
        }
        return sum;
    }
}


//n % 10 to extract least significant digit || 125 --> 12
//n = n / 10 to discard least-significant digit || 125 / 10 = 12 * 10 = 120 -> 125 - 120 = 5

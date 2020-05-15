public class FandLDigSum {
    public static int sumFirstAndLastDigit(int num){
        if(num <0) return -1;
        int LDig = num % 10;
        int FDig = 0;
        while (num > 0){
            FDig = num % 10;
            num /= 10;
        }
        return FDig + LDig;
    }
}

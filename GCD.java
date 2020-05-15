public class GCD {
    public static int getGreatestCommonDivisor(int a, int b){
        if(a < 10 || b < 10) return -1;
        for (int i = a; i >= 1; i--) if(a % i == b % i && a % i == 0 && b % i == 0) return i;
        return 0;
    }
}

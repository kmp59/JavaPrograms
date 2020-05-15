public class LargestPrime {
    public static int getLargestPrime(int num){ //25
        int primeCount = 0, largestPrime = 0;
        if (num < 2) return -1;
        for(int i = num; i >= 2; i--){
            for(int j = 1; j <= i; j++){
                if(i % j == 0) primeCount++;
            }
            if (primeCount == 2 && num % i == 0){
                largestPrime = i;
                break;
            }else primeCount = 0;
        }
        if(primeCount == 0) return -1;
        return largestPrime;
    }
}

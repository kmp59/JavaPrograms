public class SumOdd {
    public static boolean isOdd(int num){
        if(num < 0) return false;
        return num % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end < start || start < 0 || end <0) return -1;
        for(int i = start; i <= end; i++){
            if(isOdd(i)) sum = sum + i;
        }
        return sum;
    }
}

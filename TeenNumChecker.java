public class TeenNumChecker {
    public static boolean hasTeen(int a, int b, int c){
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
    public static boolean isTeen(int a){
        return a <= 19 && a >= 13;
    }
}

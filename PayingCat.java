public class PayingCat {
    public static boolean isCatPlaying(boolean isSummer, int temp){
        if(isSummer){
            if(temp <= 45 && temp >= 25) return true;
        }else if(temp <= 35 && temp >= 25) return true;
        return false;
    }
}

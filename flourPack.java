public class flourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0)return false;
        for (int i =0; i < bigCount; i++){
            if(goal < 5) break;
            goal -= 5;
        }
        return smallCount >= goal;
    }
}

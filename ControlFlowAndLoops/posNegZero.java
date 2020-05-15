public class posNegZero {

    public static  void checkNum(int num){
        if(num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }
    public static void main(String[] args) {
        checkNum(0);
        checkNum(1);
        checkNum(-5);
    }
}

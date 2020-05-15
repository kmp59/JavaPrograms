public class ControlFlow {
    public static void switchState(int val) {
        switch (val){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            case 4: case 5: case 6:
                System.out.println("Value is too high");
                break;
            default:
                System.out.println("Value cannot be determined");
                break;
        }
        char item = 'K';
        switch (item){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'J': case 'K': case 'L':
                System.out.println("Value is too high");
                break;
            default:
                System.out.println("Value cannot be determined");
                break;
        }
    }
}

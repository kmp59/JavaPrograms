public class Num2Word {
    public static void numberToWords(int num){
        if(num < 0) System.out.println("Invalid Value");
        int reverse = reverse(num);
        int reverseDigitCount = getDigitCount(reverse);
        if (getDigitCount(num) >= 0) {
            if(reverse == 0) System.out.print("Zero ");
            while (reverse > 0) {
                int lastDigit = reverse % 10;
                reverse /= 10;
                switch (lastDigit) {
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    case 0:
                        System.out.print("Zero ");
                        break;
                }
            }
            for (int i = 0; i < getDigitCount(num) - reverseDigitCount; i++) System.out.print("Zero ");
        }
    }

    public static int reverse(int num){
        int reverse = 0;
        int absnum = Math.abs(num);
        while(absnum > 0){
            int lastDigit = absnum % 10;
            reverse = reverse * 10 + lastDigit;
            absnum /= 10;
        }
        if (num >= 0) return reverse;
        else return - reverse;
    }

    public static int getDigitCount(int num){
        if(num < 0) return -1;
        else if(num == 0) return 1;
        int count = 0;
        while(num > 0){
            num /= 10;
            count ++;
        }
        return count;
    }
}

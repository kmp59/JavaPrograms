import java.util.Scanner;

public class minMaxChallenge {
    public static void printMinMax(){
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max =Integer.MIN_VALUE;
        System.out.println("Enter your number: ");
        if(!sc.hasNextInt()) System.out.println("Invalid Input");
        else {
            while (sc.hasNextInt()) {
                System.out.println("Enter your number: ");
                int temp = sc.nextInt();
                if (temp < min) min = temp;
                else if (temp > max) max = temp;
            }
            System.out.println("min number is : " + min + " and max number is :" + max);
            sc.close();
        }
    }
}

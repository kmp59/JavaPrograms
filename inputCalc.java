import java.util.Scanner;

public class inputCalc {
    public static void inputThenPrintSumAndAverage(){
        long count = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            while (sc.hasNextInt()) {
                sum = sum + sc.nextInt();
                count ++;
            }
            System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        }else System.out.println("SUM = " + sum + " AVG = " + count);
        sc.close();
    }
}

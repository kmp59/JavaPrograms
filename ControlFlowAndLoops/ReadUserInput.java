import java.util.Scanner;

public class ReadUserInput {
    public static void calculate(){
        Scanner sc = new Scanner(System.in);
        int count = 1, sum = 0;
        while(count < 11){
            System.out.println("Enter number #" + count + ":");
            if(sc.hasNextInt()){
                sum = sum + sc.nextInt();
                count ++;
            }else System.out.println("Invalid Number.");
            sc.nextLine();
        }
        System.out.println("Your Total is: " + sum);
        sc.close();
    }
}

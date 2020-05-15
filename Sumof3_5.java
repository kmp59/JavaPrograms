public class Sumof3_5 {
    public static void sum(){
        int count = 0;
        int sum = 0;
        for (int i=1; i <= 1000; i++) {
            if (i % 15 == 0){
                sum= sum + i;
                count ++;
                System.out.println(i + ", ");
            }
            if(count == 5) break;
        }
        System.out.println(sum);
    }
}

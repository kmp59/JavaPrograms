public class Min2YrAndDay {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) System.out.println("Invalid Value");
        else System.out.println(minutes + " min = " +minutes/525600+ " y and " +(minutes/1440)%365+ " d");
    }
}

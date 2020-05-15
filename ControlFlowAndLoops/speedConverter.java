
public class speedConverter {
    public static long toMilesPerHour(double kmph){
        if(kmph < 0) return -1;
        return Math.round(kmph / 1.609);
    }

    public static void printConversion(double kmph){
        if(kmph < 0) System.out.println("Invalid Value");
        else System.out.println(kmph + " km/h = " + toMilesPerHour(kmph) + " mi/h");
    }

}

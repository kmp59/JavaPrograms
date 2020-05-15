public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value"; //final value constant, Can't change Value
    public static String getDurationString(int min, int sec){
        if(min < 0 || sec < 0 || sec > 59) return INVALID_VALUE_MESSAGE;
        return stringBuilder(min / 60) + "h " + stringBuilder(min % 60) + "m " + stringBuilder(sec) + "s";
    }

    public static String getDurationString(int sec){
        if(sec < 0) return INVALID_VALUE_MESSAGE;
        return getDurationString(sec / 60, sec % 60);
    }

    private static String stringBuilder(int val){
        if (val < 10) return "0" + val;
        return Integer.toString(val);
    }
}

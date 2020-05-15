public class FandItoM {
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet < 0 || ((inches < 0) && (inches > 12))) return -1;
        return calcFeetAndInchesToCentimeters(inches) + feet*12*2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches < 0) return -1;
        return (double)inches * 2.54;
    }
}

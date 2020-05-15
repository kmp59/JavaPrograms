public class NumOfDayInMon {
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    return year % 400 == 0;
                }else{
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int mon, int year){
        if(mon < 1 || mon >12 || year < 1 || year > 9999) return -1;
        switch (mon){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if(isLeapYear(year)) return 29;
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
        }
        return 0;
    }
}

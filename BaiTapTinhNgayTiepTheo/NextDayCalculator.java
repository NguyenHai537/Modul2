package BaiTapTinhNgayTiepTheo;

public class NextDayCalculator {
    public static String getDayCalulator( int day , int month , int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if ( day == 31){
                    day = 1;
                    month ++;
                }else
                    day++;
                break;
            case 12:
                if ( day == 31){
                    day = 1;
                    month = 1;
                    year ++;
                }else
                    day++;
                break;
            case 2:
                if ( isLeapYear(year) && day == 29){
                    day = 1;
                    month++;
                }else if ( day == 28){
                    day = 1;
                    month++;
                }else
                    day ++;
                break;
            default:
                if ( day ==30){
                    day = 1;
                    month++;
                }else
                    day++;
        }
        return day +"/" + month + "/" +year;
    }

    private static boolean isLeapYear(int year){
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400)
                    return true;
            } else {
                return true;
            }
        }
        return false;
    }
}

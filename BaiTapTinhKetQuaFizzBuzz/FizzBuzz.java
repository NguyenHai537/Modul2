package BaiTapTinhKetQuaFizzBuzz;

public class FizzBuzz {

    public static String readFizzBuzz(int number) {
        String result = "Số bạn nhập không đúng!";
        if (number >0 && number <100){
            boolean isDivision3 = number % 3 == 0;
            boolean isDivision5 = number % 5 == 0;
            if (isDivision3 || isNumberhas3(number)) {
                if (isDivision5) {
                    result = "FizzBuzz";
                } else
                    result = "Fizz";
            } else if (isDivision5 || isNumberhas5(number)) {
                result = "Buzz";

            } else
                result = readNumber(number);

        return result;
        }else
            return result;
    }
    public static boolean isNumberhas3(int number) {
        int numberLeft = number / 10;
        int numberRight = number % 10;
        if (numberLeft == 3 || numberRight == 3) {
            return true;
        } else
            return false;
    }
    public static boolean isNumberhas5(int number) {
        int numberLeft = number / 10;
        int numberRight = number % 10;
        if (numberLeft == 5 || numberRight == 5) {
            return true;
        } else
            return false;
    }
    public static String readNumber ( int number){
        int numberLeft = number / 10;
        int numberRight = number % 10;
        String resultReadNumber = "";
        if ( number > 0 && number < 10){
            resultReadNumber = readNumberUnits(numberRight);
        } else if (number >= 10 && number < 100) {
            resultReadNumber += readNumberTens(numberLeft);
            resultReadNumber += readNumberUnits(numberRight);
        }
        return resultReadNumber;
    }
    public static String readNumberTens(int numberLeft) {
        String result = null;
        switch (numberLeft) {
            case 1:
                result = "mười ";
                break;
            case 2:
                result ="hai ";
                break;

            case 4:
                result ="bốn ";
                break;

            case 6:
                result ="sáu ";
            case 7:
                result ="bảy ";
                break;
            case 8:
                result ="tám ";
                break;
            case 9:
                result ="chín ";
                break;

        }
        return result;
    }
    private static String readNumberUnits(int numberRight) {
        String result1 = null;
        switch (numberRight) {

            case 1:
                result1 ="một";
                break;
            case 2:
                result1 ="hai";
                break;

            case 4:
                result1 ="bốn";
                break;

            case 6:
                result1 ="sáu";
                break;
            case 7:
                result1 ="bảy";
                break;
            case 8:
                result1 ="tám";
                break;
            case 9:
                result1 ="chín";
                break;

        }
        return result1;
    }

}








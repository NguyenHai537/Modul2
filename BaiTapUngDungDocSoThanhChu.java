import java.util.Scanner;

public class BaiTapUngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of hundreds: ");
        String numberOfHundreds = scanner.nextLine();
        System.out.println("Enter number of tens: ");
        String numberOfTens = scanner.nextLine();
        System.out.println("Enter number of units: ");
        String numberOfUnits = scanner.nextLine();
        String number = numberOfHundreds + numberOfTens + numberOfUnits;
        int inumber = Integer.parseInt(number);
        int inumOfUni = Integer.parseInt(numberOfUnits);
        int inumOfTens = Integer.parseInt(numberOfTens);

        if (0 <= inumber && inumber <10){
            String result = readNumberOfUnits(numberOfUnits);
            System.out.println(result);
        } else if (10 <= inumber && inumber < 20) {
            String result = readNumberOfTens(numberOfUnits);

        } else if (20 <= inumber && inumber < 100) {
            if (inumOfUni == 0){
                String resultNumOfTens = readNumberOfTensPlus(numberOfTens);
                System.out.println(resultNumOfTens);
            }else {
                String resultNumOfTens = readNumberOfTensPlus(numberOfTens);
                String resultNumOfUnit = readNumberOfUnits(numberOfUnits);
                System.out.println(resultNumOfTens + resultNumOfUnit);
            }

        } else if (100 <= inumber && inumber <1000) {
            if(inumOfTens == 0 && inumOfUni == 0){
                String resultNumOfHund = readNumberOfHundreds(numberOfHundreds);
                System.out.println(resultNumOfHund);
            }else {
                String resultNumOfHund = readNumberOfHundreds(numberOfHundreds);
                String numberSum = numberOfTens + numberOfUnits;
                int inumberSum = Integer.parseInt(numberSum);
                String resultTens = "";
                if (0 <= inumberSum && inumberSum <10){
                    resultTens = readNumberOfUnits(numberOfUnits);
                }
                else if (10 <= inumberSum && inumberSum < 20) {
                    resultTens = readNumberOfTens(numberOfUnits);

                } else if (20 <= inumberSum && inumberSum < 100) {
                    if (inumOfUni == 0){
                        resultTens = readNumberOfTensPlus(numberOfTens);

                    }else {
                        String resultNumOfTens = readNumberOfTensPlus(numberOfTens);
                        String resultNumOfUnit = readNumberOfUnits(numberOfUnits);
                        resultTens = resultNumOfTens + resultNumOfUnit;
                    }

                }
                System.out.println(resultNumOfHund + " and " + resultTens);
            }

        }else {
            System.out.println("Out of ability");
        }


    }

    public static String readNumberOfUnits(String number) {
        String result = "";
        switch (number) {
            case "0":
                result = "Zero";
                break;
            case "1":
                result = "One";
                break;
            case "2":
                result = "Two";
                break;
            case "3":
                result = "Three";
                break;
            case "4":
                result = "Four";
                break;
            case "5":
                result = "Five";
                break;
            case "6":
                result = "Six";
                break;
            case "7":
                result = "Seven";
                break;
            case "8":
                result = "Eight";
                break;
            case "9":
                result = "Nine";
                break;

        }
        return result;

    }

    public static String readNumberOfTens(String number) {
        String result = "";
        switch (number) {
            case "0":
                result = "Ten";
                break;
            case "1":
                result = "Eleven";
                break;
            case "2":
                result = "Twelve";
                break;
            case "3":
                result = "Thirteen";
                break;
            case "4":
                result = "Fourteen";
                break;
            case "5":
                result = "Fifteen";
                break;
            case "6":
                result = "Sixteen";
                break;
            case "7":
                result = "Seventeen";
                break;
            case "8":
                result = "Eightteen";
                break;
            case "9":
                result = "Nineteen";
                break;
        }
        return result;
    }
    public static String readNumberOfTensPlus(String number) {
        String result = "";
        switch (number) {

            case "2":
                result = "Twenty";
                break;
            case "3":
                result = "Thirty";
                break;
            case "4":
                result = "Fourty";
                break;
            case "5":
                result = "Fifty";
                break;
            case "6":
                result = "Sixty";
                break;
            case "7":
                result = "Seventy";
                break;
            case "8":
                result = "Eightty";
                break;
            case "9":
                result = "Ninety";
                break;
        }
        return result;
    }
    public static String readNumberOfHundreds(String number) {
        String result = "";
        switch (number) {
            case "1":
                result = "One hundred";

            case "2":
                result = "Two hundred";
                break;
            case "3":
                result = "Three hundred";
                break;
            case "4":
                result = "Four hundred";
                break;
            case "5":
                result = "Five hundred";
                break;
            case "6":
                result = "Six hundred";
                break;
            case "7":
                result = "Seven hundred";
                break;
            case "8":
                result = "Eight hundred";
                break;
            case "9":
                result = "Nine hundred";
                break;
        }
        return result;
    }
}





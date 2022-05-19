package pl.click;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {

            boolean isDivisibleByFour = year % 4 == 0;
            if (isDivisibleByFour) {
                boolean isDivisibleByHundred = year % 100 == 0;
                if (isDivisibleByHundred) {
                    boolean isDivisibleByFourHundred = year % 400 == 0;
                    if (isDivisibleByFourHundred) {
                        System.out.println(year + "is a leap year");
                        return true;
                    }
                }
            }

        }  return false;
    }
}


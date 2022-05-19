package pl.click;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {

        if ((numberOne >= 10 && numberOne <= 1000) && (numberTwo >= 10 && numberTwo <= 1000) && (numberThree >= 10 && numberThree <= 1000)) {

            int firstNumberLastDigit = numberOne % 10;
            int secondNumberLastDigit = numberTwo % 10;
            int thirdNumberLastDigit = numberThree % 10;

            return ((firstNumberLastDigit == secondNumberLastDigit) || (firstNumberLastDigit == thirdNumberLastDigit) || (secondNumberLastDigit == thirdNumberLastDigit));

        }
        return false;
    }

    public static boolean isValid(int numberFour) {

        if ((numberFour >= 10 && numberFour <= 1000)) {
            return true;
        }
        return false;
    }
}

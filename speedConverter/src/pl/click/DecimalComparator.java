package pl.click;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        if (numberOne < 0 && numberTwo > 0 || numberOne > 0 && numberTwo < 0) {
            return false;
        }
        double oneThousand = numberOne * 1000;
        double twoThousand = numberTwo * 1000;

        int firstInt = (int) oneThousand;
        int secondInt = (int) twoThousand;

        if (firstInt == secondInt) {
            return true;
        } else {
            return false;
        }
    }
}



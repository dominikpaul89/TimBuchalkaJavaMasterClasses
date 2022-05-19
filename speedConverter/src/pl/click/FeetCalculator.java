package pl.click;

public class FeetCalculator {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid");
            return -1;
        }
            double calcCent = (feet *12) * 2.54;
            calcCent += inches *2.54;

            System.out.println(" tyle centow jest w tej miarze " + calcCent + " cm");
            return calcCent;




    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

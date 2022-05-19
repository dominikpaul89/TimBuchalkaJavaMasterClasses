package pl.click;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if ((!barking) || (hourOfDay<0) || (hourOfDay > 23)  || ( 8 <= hourOfDay && hourOfDay < 23))
        {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;

        }
    }
}

package pl.click;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else if (minutes >= 0 && minutes < 1439){
            System.out.println(minutes + " min = 0 y and 0 d");
        }
        else if (minutes >= 1440 && minutes < 525599){
            long calcDays = minutes / 1440;

            System.out.println(minutes + " min = 0 y and " + calcDays +" d");
        } else if (minutes >= 525600) {
            long calcYears = minutes / 525600;

            long remainingMinutes = minutes % 525600;

            long calcDays = remainingMinutes / 1440;

            System.out.println(minutes + " min = " + calcYears + " y and " + calcDays +" d");
        }

    }
}

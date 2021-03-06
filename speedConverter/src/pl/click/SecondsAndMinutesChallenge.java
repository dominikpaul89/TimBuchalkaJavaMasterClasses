package pl.click;public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("invalid value");
            return "invalid value";
        }
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours + "h " +remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }


}

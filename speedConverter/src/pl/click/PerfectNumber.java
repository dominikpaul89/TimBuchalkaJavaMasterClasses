package pl.click;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int pd = 1;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                pd = i;
                sum +=pd;

                if (sum == number){
                    return true;
                }
            }
        }
        return false;
    }
}

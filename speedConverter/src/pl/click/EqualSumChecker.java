package pl.click;

public class EqualSumChecker {
    public static boolean hasEqualSum(int one, int two, int three){
        int equalSUm = one + two;
        if (equalSUm == three){
            return true;
        } else {
            return false;
        }
    }
}

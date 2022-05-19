package pl.click;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        int reverse = 0;
        int numberTwo = number;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        if (numberTwo == reverse){
            return true;
        }



    return false;}

}

package pl.click;

public class SumOddRange {
    public static boolean isOdd(int number){
        if (number< 0){
            return false;
        }else if (number % 2 == 0){
            return false;
        } return true;
    }

    public static int sumOdd(int start, int end) {
        int count = start;
        int sum = 0;
    if (start > 0 && end > 0 && end >= start) {

    for (int i = start; i <= end; i++) {
      if (isOdd(i)){
          i++;
          sum +=i;
      }
    } return sum;
}

return -1;
 }
    }


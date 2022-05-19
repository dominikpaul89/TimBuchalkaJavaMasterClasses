package pl.click;

public class FlourPacker {
    public static boolean canPack( int bigCount, int smallCount, int goal){
         int bigCountCounted = bigCount * 5;
         int smallCountCounted = smallCount * 1;

         int sum = bigCountCounted + smallCountCounted;

         if (sum < goal){
             return false;
         } else if (bigCount < 0 || smallCount < 0 || goal < 0){
             return false;
         } else if ((goal % 5) > smallCount){
             return false;
         }
         return true;
    }
}

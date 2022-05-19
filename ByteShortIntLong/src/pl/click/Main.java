package pl.click;

public class Main {

    public static void main(String[] args) {
        byte myByte = 100;
        short myShort = 30000;
        int myInt = 10000;
        long myLong = 50000 + (10*(myByte + myShort + myInt));
        System.out.println(myLong);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("my float value " + myFloatValue);
        System.out.println("my double value " + myDoubleValue);
        System.out.println("my int value" + myIntValue);

//        challenge
          float myPounds = 50;
          float myKG = myPounds * 0.45359237f;
        System.out.println(myKG + "kg");

        char myChar = 'd';
        char myUnicodeChar = '\u00a9';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        String myString = "This is a string";
        System.out.println("this is a string " + myString);
    }
}

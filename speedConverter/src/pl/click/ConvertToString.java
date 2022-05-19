package pl.click;

public class ConvertToString {
    public static void conversion(int name){
        String numberAsString = "2018";
        System.out.println("number as a string ="+numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = "+ number);

        numberAsString +=1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

    }
}

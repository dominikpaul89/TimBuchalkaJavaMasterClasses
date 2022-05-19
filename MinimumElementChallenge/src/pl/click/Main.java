package pl.click;

public class Main {

    public static void main(String[] args) {
        int myIntegers = MinimumElement.readInteger();
        int [] myNumbers = MinimumElement.readElements(MinimumElement.readInteger());
        int min = MinimumElement.findMin(myNumbers);
    }
}

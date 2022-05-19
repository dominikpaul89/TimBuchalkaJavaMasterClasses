package pl.click;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander( int roadServiceMonths) {
        super("Outlander", "4wd", 5,5,6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
    }
}

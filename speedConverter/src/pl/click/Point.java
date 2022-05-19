package pl.click;

public class Point {
    //objects
    private int x;
    private int y;

    //constructors

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance (){
       return Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));

    }
    public double distance( int x, int y){
       return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    public double distance(Point secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
    }
}

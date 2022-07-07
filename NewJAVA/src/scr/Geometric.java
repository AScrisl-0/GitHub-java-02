package scr;

public abstract class Geometric {
    public double getArea() {
        return 0;
    };
    public  double getPerimeter() {
        return 0;
    };
    private String color;
    boolean filled;
    public Geometric(String color,boolean filled){
        this.color=color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public static boolean isFill() {
        return true;
    }
    public void setFill(boolean filled) {
        this.filled=filled;
    }
}
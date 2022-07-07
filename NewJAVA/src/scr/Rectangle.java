package scr;

public class Rectangle extends Geometric{
    public Rectangle(String color, boolean fill,double side1,double side2) {
        super(color, fill);
        this.side1=side1;
        this.side2=side2;

    }
    private double side1;
    private double side2;
    public double area() {
        return side1*side2;
    }
    public double perimeter() {
        return side1*2+side2*2;
    }
    public double getWidth() {
        return side1;
    }
    public void setWidth(double width) {
        this.side1 = width;
    }
    public double getHeight() {
        return side2;
    }
    public void setHeight(double side2) {
        this.side2 = side2;
    }
    public String toString() {
        return "长方形宽是："+side1+"长方形的高是："+side2;
    }
}
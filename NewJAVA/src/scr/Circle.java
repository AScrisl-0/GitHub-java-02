package scr;

public  class Circle extends Geometric{
    private double radius;

    public Circle(String color,boolean fill,double radius) {
        super(color,fill);
        this.radius=radius;
    };
    public double area() {

        return Math.PI*radius*radius;

    };
    public double perimeter() {

        return Math.PI*2*radius;
    }
    public double getRadius() {
        return radius;
    }
    public double setRadius(double radius) {
        return this.radius = radius;
    };
    //tostring 方法
    public String toString() {
        return "圆的半径是："+radius;
    }

}
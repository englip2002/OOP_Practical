package Practical7.P7Q3;

public class Circle {
    protected double radius;
    protected double area;

    public Circle(){};
    public Circle(double radius){
        this.radius=radius;
        this.area=calculateArea(radius);
    }

    private double calculateArea(double radius){
        return 3.1415926*Math.pow(radius, 2);
    }

}

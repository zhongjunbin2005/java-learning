package Circletext;

public class Circle {
    private double radius;
    private final double PI=3.14;
    public  Circle(){}
    public  Circle(double radius){
        this. radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getPI(){
        return PI;
    }
    public double mianji(){
        return PI*radius*radius;
    }
    public double zhouchang(){
        return  PI*2*radius;
    }
}

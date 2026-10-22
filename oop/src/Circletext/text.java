package Circletext;

public class text {
    public static void main(String[] args) {
        Circle a=new Circle();
        Circle b=new Circle(6);
        a.setRadius(5);
        System.out.println(a.getRadius());
        System.out.println(a.getPI());
        System.out.println(a.mianji());
        System.out.println(a.zhouchang());
        System.out.println(b.getRadius());
        System.out.println(b.getPI());
        System.out.println(b.mianji());
        System.out.println(b.zhouchang());

    }
}

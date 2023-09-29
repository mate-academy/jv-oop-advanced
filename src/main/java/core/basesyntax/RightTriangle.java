package core.basesyntax;

public class RightTriangle implements Figure {
    double firstAngle;
    double secondAngle;
    String color;

    public RightTriangle(double firstAngle,double secondAngle,String color){
        this.firstAngle = firstAngle;
        this.secondAngle = secondAngle;
        this.color = color;

    }
    @Override
    public double getArea(){
        return (firstAngle * secondAngle) / 2;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a square...");
        System.out.println("firstAngle: " + firstAngle);
        System.out.println("secondAngle: " + secondAngle);
        System.out.println("Area: " + getArea());
    }
    //formula (a*b) / 2
}

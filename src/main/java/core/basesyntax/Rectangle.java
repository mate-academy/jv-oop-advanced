package core.basesyntax;

public class Rectangle implements Figure {
    double firstSide;
    double secondSide;
    String color;
    public Rectangle(double firstSide, double secondSide , String color){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }
    @Override
    public double getArea(){
        return firstSide * secondSide;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle...");
        System.out.println("First side: " + firstSide);
        System.out.println("Second side: " + secondSide);
        System.out.println("Area: " + getArea());
        System.out.println("Color: " + color);
    }

    //formula a * b
}

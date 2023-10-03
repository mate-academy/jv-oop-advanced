package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double firstAngle;
    private double secondAngle;

    public RightTriangle(double firstAngle,double secondAngle,String color) {
        super(color);
        this.firstAngle = firstAngle;
        this.secondAngle = secondAngle;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (firstAngle * secondAngle) / 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a RightTriangle...");
        System.out.println("firstAngle: " + firstAngle);
        System.out.println("secondAngle: " + secondAngle);
        System.out.println("Area: " + getArea());
        System.out.println("Color: " + color);
    }
}

package core.basesyntax;

public class RightTriangle extends RandomFigure {
    private double firstAngle;
    private double secondAngle;

    public RightTriangle(double firstAngle, double secondAngle, String color) {
        super(color);
        this.color = color;
        this.firstAngle = firstAngle;
        this.secondAngle = secondAngle;
    }

    @Override
    public double getArea() {
        return (firstAngle * secondAngle) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Loading a Right triangle");
        System.out.println("Area - " + getArea());
        System.out.println("Color - " + color);
        System.out.println("First angle - " + firstAngle);
        System.out.println("Second angle - " + secondAngle);
    }
}

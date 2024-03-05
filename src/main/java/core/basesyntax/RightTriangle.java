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
        System.out.println("Loading a Right triangle \n" + "Area - " + getArea() + "\n"
                + "Color - " + color + "\n" + "First angle - " + firstAngle + "\n"
                + "Second angle - " + secondAngle);
    }
}

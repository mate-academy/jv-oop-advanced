package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private double a;
    private double b;

    public RightTriangle(double a, double b,String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return (a * b) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:RightTriangle " + "Color:" + getColor() + " " + "Area: " + getArea());
    }
}

package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double a;
    private double b;
    private double c;

    public IsoscelesTrapezoid(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return ((a + b) / 2) * c;
    }

    @Override
    public void draw() {
        System.out.println("Figure:IsoscelesTrapezoid " + "Color:" + getColor() + " " + "Area: " + getArea());
    }
}

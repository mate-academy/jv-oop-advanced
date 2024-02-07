package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lengthA;
    private double lengthB;
    private double height;

    public IsoscelesTrapezoid(String color, double a, double b, double height) {
        super(color);
        this.lengthA = a;
        this.lengthB = b;
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + "sq.units, color: " + getColor() + ", side a: " + lengthA
                + ", side b: " + lengthB + ", height: " + height);
    }

    @Override
    public double calculateArea() {
        return (lengthA * lengthB) / 2 * height;
    }
}

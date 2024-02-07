package core.basesyntax;

public class RightTriangle extends Figure {
    private double lengthA;
    private double lengthB;

    public RightTriangle(String color, double a, double b) {
        super(color);
        this.lengthA = a;
        this.lengthB = b;
    }

    @Override
    public void print() {
        System.out.println("Figure: right triangle, area: " + calculateArea() + " sq.units, color: "
                + getColor() + ", side a: " + lengthA + ", side b: " + lengthB);
    }

    @Override
    public double calculateArea() {
        return (lengthA * lengthB) / 2;
    }
}

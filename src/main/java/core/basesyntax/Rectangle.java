package core.basesyntax;

public class Rectangle extends Figure {
    private double lengthA;
    private double lengthB;

    public Rectangle(String color, double a, double b) {
        super(color);
        this.lengthA = a;
        this.lengthB = b;
    }

    @Override
    public void print() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq.units, color: "
                + getColor() + ", side a: " + lengthA + ", side b: " + lengthB);
    }

    @Override
    public double calculateArea() {
        return lengthA * lengthB;
    }
}

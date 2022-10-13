package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, side A: " + getSideA()
                + " units, side B: " + getSideB()
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}

package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideB * sideA;
    }

    @Override
    public String printInfo() {
        return "Figure: triangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "sideA: " + sideA + " units, "
                + "sideA: " + sideB + " units, "
                + "color: " + getColor();
    }
}
package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, sideA: " + sideA + " units, sideB: " + sideB
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}

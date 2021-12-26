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
    public double area() {
        return sideA * sideB;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + formatDouble(area(), 1) + " sq.units, side a: "
                + formatDouble(sideA) + " units, " + "side b: "
                + formatDouble(sideB) + " units, color: " + getColor();
    }

}

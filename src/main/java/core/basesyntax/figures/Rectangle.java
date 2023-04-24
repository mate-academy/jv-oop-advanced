package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(String color, double sideA, double sideB) {
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
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, area: "
                + getArea() + " sq.units, sideA: "
                + getSideA() + " units, sideB: "
                + getSideB() + " units, color: "
                + getColor();
    }
}

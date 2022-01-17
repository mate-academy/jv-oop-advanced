package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public double getSide_a() {
        return sideA;
    }

    public void setSide_a(double sideA) {
        this.sideA = sideA;
    }

    public double getSide_b() {
        return sideB;
    }

    public void setSide_b(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toDraw() {
        return "Figure: " + getFigureType() + ", area: " + getArea() + " sq.units, side a: "
                + getSide_a() + " units, side b: " + getSide_b() + " units, color: " + getColor();
    }
}

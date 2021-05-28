package core.basesyntax;

public class Rectangle extends Figure {

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.setColor(color);
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "area="
                + getArea()
                + " sq.units"
                + ", sideA="
                + sideA
                + " units"
                + ", sideB="
                + sideB
                + " units"
                + ", color='"
                + getColor()
                + '\''
                + '}';
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}

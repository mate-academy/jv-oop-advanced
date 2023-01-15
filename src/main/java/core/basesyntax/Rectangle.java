package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Figure: Rectangle {"
                + "sideA: " + sideA + " units"
                + ", sideB: " + sideB + " units"
                + ", color: " + getColor()
                + ", area: " + getArea() + " sq.units"
                + '}';
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}

package core.basesyntax;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int a, int b) {
        super(color);
        sideA = a;
        sideB = b;
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "rectangle, area: " + getSquare()
                + " sq.units, firstLeg: " + sideA
                + " units, secondLeg: " + sideB
                + " units, color: " + color.toLowerCase();
    }
}

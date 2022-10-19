package core.basesyntax;

public class Rectangle extends _2SideFigure implements Squarable{
    public Rectangle(String color, int a, int b) {
        super(color, a, b);
    }

    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public String toString() {
        return "rectangle, area: " + getSquare() + " sq.units, firstLeg: " + a + " units, secondLeg: " + b + " units, color: " + color.toLowerCase();
    }
}

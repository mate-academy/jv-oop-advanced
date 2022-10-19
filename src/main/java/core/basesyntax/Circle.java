package core.basesyntax;

public class Circle extends Side1Figure {
    public Circle(String color, int a) {
        super(color, a);
    }

    @Override
    public double getSquare() {
        return (int) Math.PI * Math.pow(sideA, 2);
    }

    @Override
    public String toString() {
        return "circle, area: " + getSquare()
                + " sq.units, radius: " + sideA
                + " units, color: " + color.toLowerCase();
    }
}

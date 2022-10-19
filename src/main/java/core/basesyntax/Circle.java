package core.basesyntax;

public class Circle extends _1SideFigure implements Squarable{
    public Circle(String color, int a) {
        super(color, a);
    }

    @Override
    public double getSquare() {
        return (int)Math.PI * Math.pow(a, 2);
    }

    @Override
    public String toString() {
        return "circle, area: " + getSquare() + " sq.units, radius: " + a + " units, color: " + color.toLowerCase();
    }
}

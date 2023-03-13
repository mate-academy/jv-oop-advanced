package core.basesyntax;

public class Rectangle extends Figure {
    private double first;
    private double second;

    public Rectangle(Color color, double first, double second) {
        super(color);
        this.first = first;
        this.second = second;
    }

    @Override
    public double getArea() {
        return first * second;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + String.format("%(.1f", getArea())
                + " sq.units, side a: " + first
                + " units, side b: " + second
                + " units, color: " + getColor();
    }
}

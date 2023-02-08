package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(String color, double side) {
        super("Square", color);
        this.side = side;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, Side: %.0f units, color: %s",
                getType(),area(),side,getColor());
    }

    @Override
    public double area() {
        return side * side;
    }
}

package core.basesyntax;

public class Square extends Figure {
    private final double side;
    private final String color;

    public Square(double units, String color) {
        this.side = units;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.2f sq.units, side: %.1f units, color: %s\n",
                "square", getArea(), side, color);
    }
}

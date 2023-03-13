package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.2f sq.units, side: %.1f units, color: %s\n",
                "square", getArea(), side, getColor());
    }
}

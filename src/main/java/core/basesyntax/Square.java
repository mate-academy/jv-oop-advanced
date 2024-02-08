package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: square, area: %.3f sq.units, side: %s units, "
                        + "color: %s",
                calculateArea(), side, color));
    }
}

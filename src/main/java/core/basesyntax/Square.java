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
        System.out.printf("Shape: Square, area = %.3f sq.units, side = %.3f units"
                + ", color - %s\n", calculateArea(), side, getColor());
    }
}

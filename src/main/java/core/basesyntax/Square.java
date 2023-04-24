package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super.setColor(color);
        this.side = side;
        super.setArea(calculateArea());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square,"
                        + " area: %.1f sq. units,"
                        + " side: %.1f sq. units,"
                        + " color: %s\n",
                calculateArea(), side, getColor());
    }
}

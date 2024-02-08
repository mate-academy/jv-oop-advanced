package core.basesyntax;

public class Square extends Figure {
    private double side;

    public void setSide(double side) {
        this.side = side;
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

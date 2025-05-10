package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private final double side;

    public Square(String color, double side) {
        super(color);
        double s = side;
        this.side = s;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: square, area: %.2f sq. units,"
                + " side: %.2f units, color: %s", getArea(), side, getColor()));
    }
}

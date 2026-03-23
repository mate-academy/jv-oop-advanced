package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be > 0");
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String area = format(getArea());
        String sideStr = format(side);
        System.out.printf("Figure: square, area: %s sq. units, side: %s units, color: %s%n",
                area, sideStr, color.toLowerCase());
    }
}

package core.basesyntax;

public class Square implements AreaCalculable, Drawable {
    private final String color;
    private final double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.2f sq. units, side: %.2f units, color: %s%n",
                getArea(), side, color
        );
    }
}
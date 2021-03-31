package core.basesyntax;

public class Square extends Figure {
    private final double side;
    private final String uniqueProperty;

    public Square(String color, double side) {
        super("square", color);
        this.side = side;
        this.uniqueProperty = "side";
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq. units, %s length: %.2f units, color: %s%n",
                uniqueProperty, calculateArea(), getName(),
                side, getColor());
    }
}

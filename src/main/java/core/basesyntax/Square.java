package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super("square", color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq. units, side length: %.2f units, color: %s%n",
                getName(), calculateArea(), side, getColor());
    }
}

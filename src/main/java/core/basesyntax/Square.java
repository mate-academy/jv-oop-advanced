package core.basesyntax;

public class Square extends Figure {
    private final double side;
    private final ColorSupplier color;

    public Square(ColorSupplier color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + calculateArea() + "sq. units, side: "
                + side + " units, "
                + "color: " + color);
    }
}

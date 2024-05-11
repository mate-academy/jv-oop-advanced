package core.basesyntax;

public class Square extends AbstractFigure {
    private final double side;

    public Square(Colors color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + calculateArea() + " sq. units, side: " + side
                + " units, color: " + color.name());
    }
}

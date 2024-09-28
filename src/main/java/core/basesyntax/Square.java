package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side) {
        this.side = side;
        setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: square, area: " + obtainTheArea() + " sq. units, side: " + side
                + " units, color: " + getColor());
    }

    @Override
    public double obtainTheArea() {
        return side * side;
    }
}

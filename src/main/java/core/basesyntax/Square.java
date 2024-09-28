package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side) {
        this.side = side;
        setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: " + side
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

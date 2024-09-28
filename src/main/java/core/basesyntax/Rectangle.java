package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: rectangle, area: " + obtainTheArea() + " sq. units, width: "
                + width + " units, length: " + length + " units, color: " + getColor());
    }

    @Override
    public double obtainTheArea() {
        return width * length;
    }
}

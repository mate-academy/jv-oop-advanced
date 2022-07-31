package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {

    private double length;
    private double width;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String info() {
        setFigureName("rectangle");
        setLength(random.nextDouble() + 1);
        setWidth(random.nextDouble() + 1);
        setColor(colorSupplier.getRandomColor());
        return "Figure: " + getFigureName() + ", "
                + "area: " + getArea() + " sq.units, length: " + getLength()
                + ", width: " + getWidth() + ", color: " + getColor();

    }
}

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
    public String getInfo() {
        return "Figure: " + getFigureName() + ", "
                + "area: " + getArea() + " sq.units, length: " + getLength()
                + ", width: " + getWidth() + ", color: " + getColor();
    }

    public Rectangle setRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setFigureName("rectangle");
        rectangle.setLength(random.nextDouble() + 1);
        rectangle.setWidth(random.nextDouble() + 1);
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }
}

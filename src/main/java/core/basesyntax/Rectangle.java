package core.basesyntax;

import static core.basesyntax.Shape.RECTANGLE;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, Color color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public Shape getName() {
        return RECTANGLE;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public Color getColor() {
        return new ColorSupplier().getRandomColor();
    }

    @Override
    public void describe() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, length: "
                + getLength() + " units, width: " + getWidth() + ", units, color: " + getColor());
    }
}

package core.basesyntax;

import static core.basesyntax.Name.RECTANGLE;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.name = getName();
        this.area = getArea();
        this.color = getColor();
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public Name getName() {
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

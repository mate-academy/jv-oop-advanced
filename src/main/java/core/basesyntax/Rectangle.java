package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String name, String color, int width, int length) {
        super(name, color);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea()
                + " sq. units, length: " + getLength() + " units, width: "
                + getWidth() + " units, color: " + getColor();
    }
}

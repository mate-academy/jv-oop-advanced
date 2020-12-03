package core.basesyntax;

public class Rectangle extends Figure {
    private final String NAME = "Rectangle";
    private int length;
    private int width;

    public Rectangle(Colors color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return NAME;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq. units, width:  " + getWidth()
                + "units, length: " + getLength() + " units, color: " + getColor());
    }
}

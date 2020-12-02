package core.basesyntax;

public class Rectangle extends Figure {
    private final String name = "Rectangle";
    private int length;
    private int width;

    public Rectangle(Colors color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq. units, width:  " + getWidth()
                + "units, length: " + getLength() + " units, color: " + getColor());
    }
}

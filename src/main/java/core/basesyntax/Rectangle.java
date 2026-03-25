package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final double length;
    private final double width;

    public Rectangle(String randomColor, double length, double width) {
        super(randomColor);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width + " units, length: " + length
                + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

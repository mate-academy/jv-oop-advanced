package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
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
        System.out.println("Figure: " + getClass().getSimpleName() + ": area: "
                + this.calculateArea() + " length " + " "
                + getLength() + " width " + getWidth() + ", color: "
                + getColor());
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

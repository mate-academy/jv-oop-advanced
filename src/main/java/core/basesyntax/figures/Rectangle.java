package core.basesyntax.figures;

public class Rectangle extends Figure {
    protected double length;
    protected double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %s, length: %.2f, width: %.2f, color: %s%n",
                getArea(), length, width, color);
    }
}

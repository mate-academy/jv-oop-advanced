package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

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
        System.out.format("Figure: rectangle, color: %s, area = %.2f, (length = %.2f, "
                + "width = %.2f)\n",
                super.getColor(), getArea(), length, width);
    }
}

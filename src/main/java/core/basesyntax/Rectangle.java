package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void display() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq.units, height: " + height
                + ", width: " + width
                + ", color: " + getColor());
    }
}

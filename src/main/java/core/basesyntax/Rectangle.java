package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle with width: " + width + ", height: " + height + ", color: " + getColor();

    }
}

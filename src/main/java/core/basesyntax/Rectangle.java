package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getDraw() {
        return "Figure: rectangle, area: " + getArea() + ", width: " + width
                + ", height: " + height + ", color: " + getColor();
    }
}

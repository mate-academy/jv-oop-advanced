package core.basesyntax.models;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + ", width: "
                + width
                + ", height: "
                + height
                + ", color: "
                + color);
    }
}

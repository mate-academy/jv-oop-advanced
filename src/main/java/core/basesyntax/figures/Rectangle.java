package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int height;
    private final int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, "
                + "area: " + getArea()
                + ", height: " + height
                + ", width: " + width
                + ", color: " + getColor());
    }
}

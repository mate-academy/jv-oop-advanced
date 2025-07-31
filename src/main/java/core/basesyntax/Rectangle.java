package core.basesyntax;

public class Rectangle extends FigureParent {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive.");
        }

        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + ", area: " + findArea() + " sq. units"
                + ", width: " + width + " units"
                + ", height: " + height + " units"
                + ", color: " + getColor());
    }

    @Override
    public double findArea() {
        return roundTo(width * height);
    }
}

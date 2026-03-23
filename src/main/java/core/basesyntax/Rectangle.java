package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be > 0");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        String areaStr = format(getArea());
        String w = format(width);
        String h = format(height);
        System.out.printf("Figure: rectangle, area: %s sq. units, width: %s units, "
                        + "height: %s units, color: %s%n",
                areaStr, w, h, color.toLowerCase());
    }
}

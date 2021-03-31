package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int width;
    private final String uniqueProperty;

    public Rectangle(String color, int height, int width) {
        super("rectangle", color);
        this.height = height;
        this.width = width;
        this.uniqueProperty = "width length";
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq. units, %s length: %d units, color: %s%n",
                uniqueProperty, calculateArea(), getName(),
                width, getColor());
    }
}

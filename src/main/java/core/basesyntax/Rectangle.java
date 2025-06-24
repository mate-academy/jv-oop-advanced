package core.basesyntax;

public class Rectangle implements AreaCalculable, Drawable {
    private final String color;
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: rectangle, area: %.2f sq. units, width: %.2f units, height: %.2f units, color: %s%n",
                getArea(), width, height, color
        );
    }
}
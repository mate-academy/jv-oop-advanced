package core.basesyntax;

public class Rectangle implements Figure {
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
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, width: " + width + " units, height: " + height + " units, color: " + color);
    }
}
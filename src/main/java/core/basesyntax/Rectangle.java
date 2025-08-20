package core.basesyntax;

public class Rectangle implements Figure, Drawable {
    private final String color;
    private final int height;
    private final int length;

    public Rectangle(String color, int height, int length) {
        this.color = color;
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return height * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, height: " + height
                + " units, length: " + length + " units, color: " + color);
    }
}

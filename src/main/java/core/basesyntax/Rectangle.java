package core.basesyntax;

public class Rectangle implements Figure {
    private final String color;
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
        public double getArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, length: "
                    + length + " units, width: " + width + " units, color: " + color);
    }
}

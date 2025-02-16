package core.basesyntax;

public class RightTriangle implements Figure {

    private final String color;
    private final double width;
    private final double length;

    public RightTriangle(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0.5 * width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, firstLeg: " + width + " units, secondLeg: " + length + " units, color: " + color);
    }
}

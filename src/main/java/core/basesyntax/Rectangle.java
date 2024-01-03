package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: Rectangle, area: "
                            + getArea() + " m^2, length: "
                            + length + ", width: "
                            + width + ", color: "
                            + getColor());
    }
}

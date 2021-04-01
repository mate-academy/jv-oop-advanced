package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, color: %s, length: %d units, "
                        + "width: %d units, area: %.1f sq. units\n ",
                getName(), getColor(), length, width, getArea());
    }
}

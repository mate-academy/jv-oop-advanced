package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(String color, int length, int width) {
        this.setColor(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void obtainTheArea() {
        setArea(length * width);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, length: "
                + length + "units, width: " + width + " units, color: " + getColor().toLowerCase());
    }
}

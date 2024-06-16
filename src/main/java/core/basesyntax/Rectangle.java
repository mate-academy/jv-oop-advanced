package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

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
    public void draw() {
        String string = String.format("Figure: Rectangle, area: %,.2f sq. units, length: %d units, "
                + "width: %d units,"
                + " color: %s", getArea(), length, width, getColor());
        System.out.println(string);
    }
}

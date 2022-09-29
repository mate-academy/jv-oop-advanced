package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq.units, length: " + length + " units, width: "
                + width
                + " units, color: " + getColor());
    }
}

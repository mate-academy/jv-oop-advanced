package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    protected Rectangle(Color color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    protected int getLength() {
        return length;
    }

    protected int getWidth() {
        return width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Rectangle has drawn!");
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString()
                + "length: " + length + " units, "
                + "width: " + width + " units.";
    }
}

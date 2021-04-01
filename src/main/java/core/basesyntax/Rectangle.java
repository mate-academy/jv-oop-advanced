package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(int width, int length, Color color) {
        this.width = width;
        this.length = length;
        setColor(color);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width
                + " units, length: " + length
                + " units, color: " + getColor());
    }
}

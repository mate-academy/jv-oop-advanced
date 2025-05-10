package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, length: " + length
                + " units, width: " + width + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

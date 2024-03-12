package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private int width;
    private int length;

    public Rectangle(int width, int length, Color color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return (double) width * length;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: rectangle, area: " + getArea() + " sq. units, width: "
                + width + " units, length: " + length + " units, color: "
                + getColor().name().toLowerCase();
    }
}

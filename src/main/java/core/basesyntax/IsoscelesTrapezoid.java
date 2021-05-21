package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureArea {
    private final double bottom;
    private final double top;
    private final int height;

    public IsoscelesTrapezoid(String name, String color, int bottom, int top, int height) {
        super(name, color);
        this.bottom = bottom;
        this.top = top;
        this.height = height;
    }

    public double getAreaFigures() {
        return getArea(((bottom * top) / 2) * height);
    }

    public void printDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "bottom: " + bottom + " units, "
                + "top: " + top + " units, " + "height: " + height + " units "
                + "color: " + getColor());
    }
}

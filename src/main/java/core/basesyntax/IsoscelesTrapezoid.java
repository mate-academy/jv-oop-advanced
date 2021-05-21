package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureArea {
    private final double bottom;
    private final double top;
    private final int height;

    public IsoscelesTrapezoid(int bottom, int top, int height, String name, String color) {
        this.bottom = bottom;
        this.top = top;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    public double getArea() {
        return area = ((bottom * top) / 2) * height;
    }

    public void printDraw() {
        System.out.println("Figure: " + name
                + ", area: " + getArea() + " sq.units, "
                + "bottom: " + bottom + " units, "
                + "top: " + top + " units, " + "height: " + height + " units "
                + "color: " + color);
    }
}
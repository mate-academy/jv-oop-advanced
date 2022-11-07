package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    private final double bottom;
    private final double top;
    private final int height;

    public IsoscelesTrapezoid(String name, String color, int bottom, int top, int height) {
        super(name, color);
        this.bottom = bottom;
        this.top = top;
        this.height = height;
    }

    public double getBottom() {
        return bottom;
    }

    public double getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public double getAreaFigures() {
        return getArea(((bottom * top) / 2) * height);
    }

    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "bottom: " + getBottom() + " units, "
                + "top: " + getTop() + " units, " + "height: " + getHeight() + " units "
                + "color: " + getColor());
    }
}

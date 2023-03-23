package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area, Draw {
    private final double top;
    private final double bottom;
    private final double side;

    public IsoscelesTrapezoid(double top, double bottom, double side) {
        this.type = getClass().getSimpleName();
        this.top = top;
        this.bottom = bottom;
        this.side = side;
        this.color = ColorSupplier.getRandomColor();
    }
    @Override
    public double getArea() {
        double length = (bottom - top) / 2;
        double height = (side * side) - (length * length);
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + ", top: " + top + ", bottom: " + bottom + ", side: " + side + ", color: " + color);
    }
}

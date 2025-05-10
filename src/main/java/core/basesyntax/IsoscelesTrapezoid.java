package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double top;
    private final double bottom;
    private final double side;

    public IsoscelesTrapezoid(Color color, double top, double bottom, double side) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.side = side;
    }

    @Override
    public double getArea() {
        double length = (bottom - top) / 2;
        double height = (side * side) - (length * length);
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + ", top: " + top + ", bottom: " + bottom
                + ", side: " + side + ", color: " + color);
    }
}

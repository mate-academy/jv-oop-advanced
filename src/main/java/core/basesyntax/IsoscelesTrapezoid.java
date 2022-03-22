package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height,
                              String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public String toString() {
        return "Figure"
                + ": isosceles trapezoid"
                + ", area: " + getArea() + " sq.units"
                + ", upper base: " + upperBase + " units"
                + ", lower base: " + lowerBase + " units"
                + ", height: " + height + " units"
                + ", color: " + getColorFigure();
    }
}

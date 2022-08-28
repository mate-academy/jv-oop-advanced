package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        setFigureType(FigureTypeName.isoscelesTrapezoid.toString());
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public String drow() {
        return "Drowing a " + getFigureType();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureType() + ", area: " + area() + " sq.units"
                + ", topBase: " + topBase + ", bottomBase: " + bottomBase + ", height: " + height
                + " units, color: " + getColor();
    }
}

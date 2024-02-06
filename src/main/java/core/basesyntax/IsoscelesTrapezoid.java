package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureArea, Draw {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topBase * bottomBase) / 2) * height;
    }

    @Override
    public String toString() {
        return getDraw();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getDraw() {
        return "IsoscelesTrapezoid: area: "
                + getArea()
                + " sq.units, "
                + "topBase: " + topBase
                + " units, "
                + "bottomBase: " + bottomBase
                + " units, "
                + "height: " + height
                + " units, "
                + "color: " + getColor();
    }
}

package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int botSide;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topSide = topBase;
        this.botSide = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topSide + botSide) / 2 * height;
    }

    @Override
    public String drawFigure() {
        return ("Figure: Isosceles Trapezoid, area: " + getArea() + " sq.units, topSide: "
                + topSide + " units, botSide: " + botSide + " units, height: "
                + height + " units, color: " + getColor());
    }
}

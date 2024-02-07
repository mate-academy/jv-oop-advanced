package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int bottomSide;
    private final int side;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int side, String color) {
        setColor(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.side = side;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) * 2.00 * Math.sqrt(side * side - (bottomSide - topSide)
                * (bottomSide - topSide) / 4.00);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, top side: "
                + topSide + " units, bottom side: " + bottomSide + " units, side: "
                + side + " units, color: " + getColor());
    }
}

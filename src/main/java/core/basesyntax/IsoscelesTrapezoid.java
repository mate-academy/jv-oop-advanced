package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int side;

    public IsoscelesTrapezoid(int lowerBase, int upperBase, int side, String color) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.side = side;
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) * Math.sqrt((side * side)
                - ((lowerBase - upperBase) * (lowerBase - upperBase)) / 4);
    }

    @Override
    public void drawFigure() {
        System.out.println(("Figure: right triangle, upper base: " + upperBase
                + ", lower base: " + lowerBase + ", side " + side
                + ", area: " + getArea() + ", color: " + getColor()));
    }
}

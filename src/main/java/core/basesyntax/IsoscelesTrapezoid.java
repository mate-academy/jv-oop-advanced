package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int side;

    public IsoscelesTrapezoid(int topBase, int bottomBase,
                              int side, Color color) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    @Override
    public double getArea() {
        return (double)(bottomBase + topBase) / 2
                * Math.sqrt(side * side
                - (double)((bottomBase - topBase)
                * (bottomBase - topBase) / 4));
    }

    @Override
    public void drawFigure() {
        System.out.println("Isosceles Trapezoid, area: "
                        + getArea()
                        + " sq.units, side: "
                        + getSide()
                        + ", top base: "
                        + getTopBase()
                        + ", bottom base: "
                        + getBottomBase()
                        + " units, color: "
                        + getColor());
    }
}

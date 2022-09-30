package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int heigh;
    private int topBase;
    private int bottomBase;

    public IsoscelesTrapezoid(Color color, int heigh, int topBase, int bottomBase) {
        super(color);
        this.heigh = heigh;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    public int getHeigh() {
        return heigh;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * heigh;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, heigh: " + getHeigh() + " units, top base: " + getTopBase()
                + " units, bottom base: " + getBottomBase() + " color: "
                + getColor().name().toLowerCase());
    }
}

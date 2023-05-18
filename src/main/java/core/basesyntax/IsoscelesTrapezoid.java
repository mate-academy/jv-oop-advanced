package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int bottomBase;
    private final int topBase;
    private final int heightOfTrapezoid;

    public IsoscelesTrapezoid(String color, int bottomBase, int topBase, int heightOfTrapezoid) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.heightOfTrapezoid = heightOfTrapezoid;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getTheArea() + " sq.units, bottom base: " + bottomBase
                + " sq.units, top base: " + topBase
                + " sq.units, height: " + heightOfTrapezoid
                + " units, color: " + getColor());
    }

    @Override
    public double getTheArea() {
        return ((bottomBase + topBase) / 2.0) * heightOfTrapezoid;
    }
}

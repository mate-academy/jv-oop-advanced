package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int topBase;
    private int bottomBase;

    public IsoscelesTrapezoid(int leg, int topBase, int bottomBase, String color) {
        super(color);
        this.leg = leg;
        this.topBase = topBase;
        this. bottomBase = bottomBase;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 4)
                * Math.sqrt(4 * Math.pow(leg, 2) * leg - Math.pow(bottomBase - topBase, 2));
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: isosceles trapezoid, area: ")
                .append(getArea()).append(" sq.units, leg: ").append(leg)
                .append(" units, top base: ").append(topBase).append(" units, bottom base: ")
                .append(bottomBase).append(" units, color: ").append(getColor()).toString());
    }
}

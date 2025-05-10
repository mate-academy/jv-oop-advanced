package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int side;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int side) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2.0)
                * Math.sqrt(Math.pow(side, 2) - Math.pow(Math.pow((bottomBase - topBase), 2)
                / (2 * (bottomBase - topBase)), 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, topBase: " + topBase
                + " units, bottomBase: " + bottomBase
                + " units, side: " + side
                + " units, color: " + getColor());
    }
}

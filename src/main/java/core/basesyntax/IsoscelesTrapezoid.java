package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int leg;
    private final int topBase;
    private final int bottomBase;

    public IsoscelesTrapezoid(String color, int leg, int topBase, int bottomBase) {
        super(color);
        this.leg = leg;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea()
                + " sq.units, sides: " + leg
                + " units, upSide: " + topBase
                + " units, downSide: " + bottomBase
                + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        int halfPerimeter = (2 * leg + topBase + bottomBase) / 2;
        return Math.sqrt(Math.pow(halfPerimeter - leg, 2)
                * (halfPerimeter - bottomBase) * (halfPerimeter - topBase));
    }
}

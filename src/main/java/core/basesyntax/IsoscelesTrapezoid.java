package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int bottomBase;
    private final int upBase;
    private final int height;

    public IsoscelesTrapezoid(Color color, int bottomBase, int upBase, int height) {
        super(color);
        this.bottomBase = bottomBase;
        this.upBase = upBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (bottomBase + upBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea() + "sq.units, bottomBase: "
                + bottomBase + " units, upBase: "
                + upBase + " units, height: "
                + height + " units, color: "
                + getColor().name().toLowerCase());
    }
}

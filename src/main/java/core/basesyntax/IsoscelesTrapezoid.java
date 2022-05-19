package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topLeg;
    private final double bottomLeg;
    private final double height;

    public IsoscelesTrapezoid(Color color, double topLeg, double bottomLeg, double height) {
        super(color);
        this.topLeg = topLeg;
        this.bottomLeg = bottomLeg;
        this.height = height;
        setName("isosceles trapezoid");
    }

    @Override
    public double getArea() {
        return (topLeg + bottomLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.1f sq.units, "
                        + "topLeg: %.1f units, "
                        + "bottomLeg: %.1f units,"
                        + " height: %1.f units, "
                        + "color: %s\n",
                getName(), getArea(), topLeg, bottomLeg, height, getColor());
    }
}

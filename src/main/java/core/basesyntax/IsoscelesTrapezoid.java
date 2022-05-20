package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topLeg;
    private final double bottomLeg;
    private final double height;

    public IsoscelesTrapezoid(Color color, String name,
                              double topLeg, double bottomLeg, double height) {
        super(color, name);
        this.topLeg = topLeg;
        this.bottomLeg = bottomLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topLeg + bottomLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: units, "
                        + "topLeg: units, "
                        + "bottomLeg: units, "
                        + "height: units, "
                        + "color: %s\n",
                getName(), getArea(), topLeg, bottomLeg, height, getColor());
    }
}


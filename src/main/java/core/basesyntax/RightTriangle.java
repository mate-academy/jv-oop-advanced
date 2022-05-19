package core.basesyntax;

public class RightTriangle extends Figure {
    private final double baseLeg;
    private final double heightLeg;

    public RightTriangle(Color color, double baseLeg, double heightLeg) {
        super(color);
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
        setName("right triangle");
    }

    @Override
    public double getArea() {
        return baseLeg * heightLeg / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                       + "area: %.1f sq.units, "
                       + "baseLeg: %.1f units, "
                       + "heightLeg: %1.f, "
                       + "color: %s\n",
                getName(), getArea(), baseLeg, heightLeg, getColor());
    }
}

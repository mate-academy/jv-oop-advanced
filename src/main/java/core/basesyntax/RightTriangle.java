package core.basesyntax;

public class RightTriangle extends Figure {
    private double baseLeg;
    private double heightLeg;

    public RightTriangle(double baseLeg, double heightLeg, Color color) {
        super.setColor(color);
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
    }

    @Override
    public double getArea() {
        return baseLeg * heightLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
                + "area: " + getArea() + " sq.units, "
                + "baseLeg: " + baseLeg + " units, "
                + "heightLeg: " + heightLeg + " units, "
                + "color: " + getColor());
    }
}

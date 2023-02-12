package core.basesyntax;

public class RightTriangle extends Figure {
    private double baseLeg;
    private double heightLeg;

    public RightTriangle(double baseLeg, double heightLeg, Color color) {
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
        super.setColor(color);
    }

    public RightTriangle() {
    }

    @Override
    public double getArea() {
        return (double) ((baseLeg * heightLeg) / 2.0);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
                + "area: " + getArea() + " sq.units, "
                + "baseLeg: " + baseLeg + "units "
                + "heightLeg: " + heightLeg + " units "
                + "color: " + getColor());
    }
}

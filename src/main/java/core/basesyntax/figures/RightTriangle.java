package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double baseLeg;
    private double heightLeg;

    public RightTriangle(double baseLeg, double heightLeg, String color) {
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
        setColor(color);
    }

    @Override
    public double areaCalc() {
        double area = (baseLeg * heightLeg) / 2;
        return getRound(area);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + areaCalc()
                + " sq. units, base leg: " + baseLeg + " units, "
                + "height Leg: " + heightLeg + " units, "
                + "color: " + getColor());
    }
}

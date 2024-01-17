package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double baseLeg;
    private double heightLeg;

    public RightTriangle(double baseLeg, double heightLeg, String color) {
        super(color);
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return (baseLeg * heightLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getStringFormat(calculateArea())
                + " sq. units, base leg: " + getStringFormat(baseLeg) + " units, "
                + "height Leg: " + getStringFormat(heightLeg) + " units, "
                + "color: " + getColor());
    }
}

package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double baseA = 0;
    private double baseB = 0;
    private double hight = 0;

    public IsoscelesTrapezoid(String colour, double baseA, double baseB, double hight) {
        super(colour);
        this.baseA = baseA;
        this.baseB = baseB;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return (baseA + baseA) / 2 * hight;
    }

    @Override
    public String toString() {
        return "Figure: " + Figures.ISOSCELES_TRAPEZOID.name().toLowerCase() + ", area:" + getArea()
                + " sq.units, first base: " + baseA + " , second base: "
                + baseB + " , hight: " + hight + " units, color: " + getColour();
    }
}

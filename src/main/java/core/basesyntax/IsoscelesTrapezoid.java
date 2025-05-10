package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sizeA;
    private double sizeB;
    private double sizeC;

    public IsoscelesTrapezoid(String color, double sizeA, double sizeB, double sizeC) {
        super(color);
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    @Override
    public double getArea() {
        return (((sizeA + sizeB) / 2)
                * Math.sqrt(Math.pow(sizeC, 2) - (Math.pow((sizeA - sizeB), 2) / 4)));
    }

    @Override
    public String getPrinting() {
        return "IsoscelesTrapezoid, area: " + getArea() + " sq. units, sizeA " + sizeA
                + " units sizeB " + sizeB + " units sizeC" + sizeC + " units, color: " + getColor();
    }
}

package core.basesyntax;

public class RightTriangle extends Figure {
    private double sizeA;
    private double sizeB;

    public RightTriangle(String color, double sizeA, double sizeB) {
        super(color);
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public double getArea() {
        return (sizeA * sizeB) / 2;
    }

    @Override
    public String getPrinting() {
        return "RightTriangle, area: " + getArea() + " sq. units, sizeA " + sizeA
                + " units sizeB " + sizeB + " units, color: " + getColor();
    }
}

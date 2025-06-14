package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, " + "area: " + getArea()
                           + " sq. units, firstLeg: " + getFirstLeg()
                           + ", secondLeg: " + getSecondLeg()
                           + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}

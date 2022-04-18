package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color, FigureType.TRIANGLE);
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
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeName() + ", area: "
                + String.format("%.2f", getArea())
                + " sq.units, firstLeg: " + getFirstLeg() + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor());
    }
}

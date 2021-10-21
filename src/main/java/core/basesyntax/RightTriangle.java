package core.basesyntax;

public class RightTriangle extends Figure implements Shape {
    private final double firstLeg;
    private final double secondLeg;

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
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg() + " units, secondLeg: "
                + getSecondLeg() + " units, color: " + getColor());
    }
}

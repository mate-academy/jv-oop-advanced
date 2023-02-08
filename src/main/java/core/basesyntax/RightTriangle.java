package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.color = color;
    }

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + this.area()
                + " sq.units, firstLeg: " + getFirstLeg() + " units, secondLeg: "
                + getSecondLeg() + "color: " + getColor());
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }
}

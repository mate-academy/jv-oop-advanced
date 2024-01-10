package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right rectangle, area: "
                + getArea()
                + " sq. units, firstSide: "
                + firstLeg
                + " units, secondSide: "
                + secondLeg
                + " units, color: "
                + getColor());
    }
}

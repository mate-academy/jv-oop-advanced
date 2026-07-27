package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, first Leg: " + firstLeg
                + " units, second Leg: " + secondLeg
                + " units, color: " + getColor()
        );
    }
}

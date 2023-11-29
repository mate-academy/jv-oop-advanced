package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
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
        System.out.println("Figure: RightTriangle, "
                + "area: " + getArea() + " sq. units, "
                + "first leg: " + firstLeg + " units, "
                + "second leg: " + secondLeg + " units, "
                + "color: " + getColor());
    }
}

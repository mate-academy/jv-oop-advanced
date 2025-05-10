package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg,double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, side: A " + firstLeg + " units, "
                + "B " + secondLeg + " units, color: " + color);
    }
}

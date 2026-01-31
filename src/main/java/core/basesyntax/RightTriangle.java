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
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq. units, a: " + firstLeg
                + "units, b: " + secondLeg
                + "units, color: " + color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}

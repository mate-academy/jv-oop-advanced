package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(double firstLeg, double secondLeg, double area, String color) {
        super(color, area);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("right triangle, " + "area: " + areaCalculate(super.getArea())
                + " sq.units, " + "first leg: " + firstLeg + " units, " + "second leg: "
                + secondLeg + " units," + " color: " + getColor());
    }

    @Override
    public double areaCalculate(double area) {
        return firstLeg * secondLeg / 2;
    }
}

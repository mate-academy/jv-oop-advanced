package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    {
        setFigureName("RightTriangle");
    }

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", area: " + String.valueOf(getArea())
                + " sq.units, first leg: " + String.valueOf(firstLeg)
                + " units, second leg: " + String.valueOf(secondLeg)
                + " units, color: " + getColor());
    }
}

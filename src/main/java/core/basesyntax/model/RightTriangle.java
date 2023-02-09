package core.basesyntax.model;

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
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, firstLeg: " + (int)firstLeg + " units,"
                + " secondLeg: " + (int)secondLeg + " units,"
                + " color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2;
    }
}

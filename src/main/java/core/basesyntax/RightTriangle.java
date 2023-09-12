package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, String color, double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double areaCalculating() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", " + "area: " + areaCalculating()
                + " sq.units, " + "first leg: " + this.firstLeg + " units, "
                + "second leg: " + this.secondLeg + " units, " + "color: " + getColor());
    }
}

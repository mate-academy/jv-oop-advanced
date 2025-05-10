package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
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
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, firstLeg: " + this.firstLeg + " units, secondLeg: "
                + this.secondLeg + " units, color: " + getColor());
    }
}

package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double areaCalculation() {
        return 0.5 * (this.firstLeg * this.secondLeg);
    }

    @Override
    public void display() {
        System.out.println("Figure: " + name() + ", area: " + areaCalculation()
                + " sq.units, firstLeg: " + this.firstLeg + " units, secondLeg: "
                + this.secondLeg + " units, color: " + getColor());
    }

    @Override
    public String name() {
        return Figures.RIGHT_TRIANGLE.name();
    }
}

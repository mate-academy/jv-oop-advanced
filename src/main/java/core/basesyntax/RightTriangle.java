package core.basesyntax;

public class RightTriangle extends Figure implements Area {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: "
                + String.format("%.2f", getArea())
                + " sq.units, sideA: "
                + firstLeg + " units, sideB: "
                + secondLeg + " units, color: " + getColor());
    }
}

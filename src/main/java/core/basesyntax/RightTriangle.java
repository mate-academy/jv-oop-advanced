package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double gerArea() {
        return 0.5 * (firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "RightTriangle " + "\n" + "firstLeg " + "= " + firstLeg + " units" + "\n"
                + "secondLeg " + "= " + secondLeg + " units" + "\n" + "Area " + "= " + gerArea() + " sq.units" + "\n"
                + "colors " + "= " + getColor());
    }
}

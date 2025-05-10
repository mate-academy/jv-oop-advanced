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
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("right triangle,"
                + " area: " + getArea()
                + " sq.units,"
                + " first leg: "
                + firstLeg + "units, "
                + " second leg: " + secondLeg
                + " units,"
                + "color: " + getColor());
    }
}

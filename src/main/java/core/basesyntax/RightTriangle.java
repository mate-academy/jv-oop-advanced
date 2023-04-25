package core.basesyntax;

public class RightTriangle extends Figure implements Area, Drawing {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq.units, first led: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + color);

    }
}

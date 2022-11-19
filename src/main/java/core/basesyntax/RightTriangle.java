package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        double area = 0.5 * firstLeg * secondLeg;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area:" + this.getArea() + " sq.units, firstLeg: "
                + firstLeg + " units,secondLeg: " + secondLeg + " units,color: " + this.getColor());
    }
}

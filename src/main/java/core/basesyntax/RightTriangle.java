package core.basesyntax;

public class RightTriangle extends Figure {
    public double firstLeg;
    public double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);

        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawArea() {
        double area = 0.5 * this.firstLeg * this.secondLeg;

        System.out.println("Figure: right triangle, " + "area: " + area + " sq. units, first leg: " + this.firstLeg + " units, " +
                "second leg: " + this.secondLeg + ", color: " + this.color);
    }
}

package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Right triangle, area: "
                + String.format("%.2f", this.getArea()) + " sq. units, first leg: "
                + this.firstLeg + " units, second leg"
                + this.secondLeg + " units, color: "
                + this.getColor());
    }

    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }
}

package core.basesyntax;

public class RightTriangle extends Figures {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + this.area() + " sq.units, first leg: "
                + this.firstLeg + " units, second leg: "
                + this.secondLeg + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return firstLeg * secondLeg / 2;
    }
}

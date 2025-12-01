package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area() + " sq. units, firstLeg: "
                + this.firstLeg + " units, secondLeg: " + this.secondLeg
                + " units, color: " + getColor());
    }
}

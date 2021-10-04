package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double findArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: "
                + findArea() + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + color);
    }
}

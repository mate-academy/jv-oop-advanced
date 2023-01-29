package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super("right triangle", color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}

package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        if (firstLeg < 0 || secondLeg < 0) {
            throw new IllegalArgumentException("The parameter values must be positive");
        }
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return secondLeg * secondLeg / 2;
    }
}
